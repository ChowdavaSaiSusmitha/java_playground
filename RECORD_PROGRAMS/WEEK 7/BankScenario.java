package inheritance;

import java.util.Scanner;
//dynamic polymorphism
class RBI {
    //method to get rate of interest
    void getRateOfInterest() {
        System.out.println("Rate of interest: 4%");
    }
}
//class sbi inherites rbi
class SBI extends RBI {
    //override the method to get rate of interest
    @Override
    void getRateOfInterest() {
        System.out.println("Rate of interest: 6%");
    }
}
//class canadabank inherites rbi
class CanadaBank extends RBI {
    @Override
    void getRateOfInterest() {
        System.out.println("Rate of interest: 7%");
    }
    //we cannot access non-overridden methods of child class from parent class object
    // but we can access overridden methods of parent class from child class object
    void canadaBankService() {
        System.out.println("CanadaBank service: International money transfer available.");
    }

}
//class apgvb inherites rbi
class APGVB extends RBI {
    @Override
    void getRateOfInterest() {
        System.out.println("Rate of interest: 5%");
    }
}

class Account {
    //private values are accessed through getter methods
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    //getter to access private variables
    String getAccountNumber() {
        return accountNumber;
    }

    double getBalance() {
        return balance;
    }

}

class Customer {
    private String name;
    private String password;

    public Customer(String name, String password) {
        this.name = name;
        this.password = password;
    }

    String getName() {
        return name;
    }

    String getPassword() {
        return password;
    }
}

public class BankScenario {
    public static void main(String[] args) {
        //take bank choice from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter bank name (RBI, SBI, CanadaBank, or APGVB): ");
        String bankName = scanner.nextLine().trim().toLowerCase();
        //parent reference can store a child class object
        RBI bank;
        switch (bankName) {
            case "rbi":
                bank = new RBI();
                break;
            case "sbi":
                bank = new SBI();
                break;
            case "canadabank":
                bank = new CanadaBank();
                break;
            case "apgvb":
                bank = new APGVB();
                break;
            default:
                System.out.println("Invalid bank name.");
                scanner.close();
                return;
        }

        bank.getRateOfInterest();
        //instanceof checks the real object type
        if (bank instanceof CanadaBank) {
            CanadaBank canadaBank = (CanadaBank) bank;
            canadaBank.canadaBankService();
        }
        
        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();
        System.out.print("Enter customer password: ");
        String password = scanner.nextLine();

        //create customer and account objects
        Customer customer = new Customer(customerName, password);
        Account account = new Account("ACC1002342361", 25000765321986754300.00);

        System.out.println("Customer: " + customer.getName());
        System.out.println("Account number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());

        scanner.close();
    }

}
