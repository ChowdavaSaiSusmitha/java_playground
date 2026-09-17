package oops;

import java.util.Scanner;

// 4. Custom Exceptions

//these are checked exceptions
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class InvalidUPIException extends Exception {
    public InvalidUPIException(String message) {
        super(message);
    }
}

class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}
//1.paymentservice interface
interface PaymentService {
    void pay();
    void checkBalance();
}
//2.wallet class
class Wallet {
    private String User;
    private long phno;
    private String UPI_ID;
    private long Balance;

    //this is a constructor to create wallet object
    public Wallet(String User, long phno, String UPI_ID, long Balance) {
        this.User = User;
        this.phno = phno;
        this.UPI_ID = UPI_ID;
        this.Balance = Balance;
    }

    //this method adds money to wallet
    public void addmoney(long amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Amount must be greater than zero.");
        }
        Balance = Balance + amount;
        System.out.println("Money added successfully. New balance: " + Balance);
    }

    public long getBalance() {
        return Balance;
    }

    //this method displays all wallet details
    public void displayWalletDetails() {
        System.out.println("User Name: " + User);
        System.out.println("Phone Number: " + phno);
        System.out.println("UPI ID: " + UPI_ID);
        System.out.println("Balance: " + Balance);
    }

    public void payMoney(String receiverUPI, long amount)
            throws InvalidUPIException, InvalidAmountException, InsufficientBalanceException {

        // Check the UPI ID using String operations.
        if (receiverUPI == null || receiverUPI.trim().isEmpty()) {
            throw new InvalidUPIException("UPI ID cannot be empty.");
        }

        if (!receiverUPI.contains("@")
                || receiverUPI.startsWith("@")
                || receiverUPI.endsWith("@")
                || receiverUPI.indexOf("@") != receiverUPI.lastIndexOf("@")) {
            throw new InvalidUPIException("UPI ID is not valid.");
        }

        // The payment amount must be positive.
        if (amount <= 0) {
            throw new InvalidAmountException("Amount must be greater than zero.");
        }

        //check whether wallet has enough balance
        if (Balance < amount) {
            throw new InsufficientBalanceException("Insufficient balance in wallet.");
        }

        // Deduct money only after all validations are successful.
        Balance = Balance - amount;
        System.out.println("Payment sent to " + receiverUPI + " for " + amount + ".");
    }
}
//upipayment class
class UPIPayment implements PaymentService {
    private Wallet wallet;
    private String receiverUPI;
    private long amount;

    //wallet object is connected with payment object here
    public UPIPayment(Wallet wallet, String receiverUPI, long amount) {
        this.wallet = wallet;
        this.receiverUPI = receiverUPI;
        this.amount = amount;
    }

    @Override
    public void pay() {
        //try block runs the payment
        try {
            wallet.payMoney(receiverUPI, amount);
        //catch block handles payment errors
        } catch (InvalidUPIException | InvalidAmountException | InsufficientBalanceException e) {
            System.out.println("Payment failed: " + e.getMessage());
        } finally {
            // This block runs whether payment succeeds or fails.
            System.out.println("Transaction completed.");
        }
    }

    @Override
    public void checkBalance() {
        System.out.println("Current Balance: " + wallet.getBalance());
    }
}

public class UpiAndDigital {
    public static void main(String[] args) {
        //Scanner takes input from user
        Scanner sc = new Scanner(System.in);

        String name="" ;
        long phone=0 ;
        String upi="" ;
        long balance =0;
        boolean choice = false;

        // Keep checking until all user details are correct.
        while (!choice) {
            //start again from a new line after wrong input
            System.out.println();
            System.out.println("Enter your name:");
            name = sc.nextLine();

            if (name == null || name.trim().isEmpty()) {
                System.out.println("Name cannot be empty.");
                continue;
            }

            System.out.println("Enter your phone number:");
            String phoneInput = sc.nextLine();

            //phone number must have 10 digits
            if (phoneInput.length() != 10) {
                System.out.println("Phone number must have 10 digits.");
                continue;
            }

            try {
                phone = Long.parseLong(phoneInput);
            } catch (NumberFormatException e) {
                System.out.println("Phone number must contain only numbers.");
                continue;
            }

            System.out.println("Enter your UPI ID:");
            upi = sc.nextLine();

            //UPI ID must contain @ symbol
            if (upi == null || upi.trim().isEmpty() || !upi.contains("@")) {
                System.out.println("UPI ID is invalid. It must contain '@'.");
                continue;
            }

            System.out.println("Enter your starting balance:");
            String balanceInput = sc.nextLine();

            try {
                balance = Long.parseLong(balanceInput);
            } catch (NumberFormatException e) {
                System.out.println("Balance must be a number.");
                continue;
            }

            if (balance <= 0) {
                System.out.println("Balance must be greater than zero.");
                continue;
            }

            choice = true;
        }

        // Only after all values are correct, create the wallet object.
        Wallet myWallet = new Wallet(name, phone, upi, balance);

        System.out.println("Do you want to see wallet details? (yes/no)");
        String detailChoice = sc.nextLine();

        if (detailChoice.equalsIgnoreCase("yes")) {
            myWallet.displayWalletDetails();
        }

        System.out.println("Do you want to add money? (yes/no)");
        String addChoice = sc.nextLine();

        if (addChoice.equalsIgnoreCase("yes")) {
            System.out.println("Enter amount to add:");
            String addInput = sc.nextLine();

            try {
                long addAmount = Long.parseLong(addInput);
                myWallet.addmoney(addAmount);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            } catch (InvalidAmountException e) {
                System.out.println(e.getMessage());
            }
        }

        // Payment is done only if user says yes.
        System.out.println("Do you want to send money? (yes/no)");
        String sendChoice = sc.nextLine();

        if (sendChoice.equalsIgnoreCase("yes")) {
            System.out.println("Enter receiver UPI ID:");
            String receiverUPI = sc.nextLine();

            System.out.println("Enter amount to send:");
            String sendAmountInput = sc.nextLine();

            try {
                long sendAmount = Long.parseLong(sendAmountInput);
                //create payment object and pass wallet object to it
                UPIPayment payment = new UPIPayment(myWallet, receiverUPI, sendAmount);
                payment.pay();
                payment.checkBalance();
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }

        System.out.println("Final balance: " + myWallet.getBalance());
        System.out.println("Program finished.");
        sc.close();
    }
}
