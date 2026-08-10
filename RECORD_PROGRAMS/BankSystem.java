package demopackage;
import java.util.Scanner;
class Account{
    int accountNumber;
    String accountHolderName;
    private int pin;
    int amount;
    String acc_type;

    public Account(int accountNumber, String accountHolderName, int pin, int amount) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.pin = pin;
        this.amount = amount;
    }

    int getPin() {
        return pin;
    }

    int credit(int creditAmount,String companyName){ 
        System.out.println("Company Name: " + companyName);
        this.amount = this.amount + creditAmount;
        System.out.println(creditAmount + " credited successfully");
        return  this.amount;
    }
    int debit(int debitAmount,String personName,int pin){ 
        if(this.pin == pin){
            if(debitAmount > 100000){
                System.out.println("Transaction limit exceeded");
                return this.amount;
            }else{
                if(this.amount >= debitAmount){
                this.amount = this.amount - debitAmount;
                System.out.println("Transaction Details: " + personName );
                System.out.println(debitAmount + " debited successfully");
                }else
                System.out.println("Insufficient balance");
            }
        } else {
            System.out.println("Invalid PIN");
        }
        return  this.amount;
    }
}

class Bank extends Account{
    String bankName;
    String branchName;
    String ifscCode;
    Account account;
    int trasactionId;
    double interestRate;


    public Bank(String bankName, String branchName, String ifscCode, Account account, int trasactionId) {
        super(account.accountNumber, account.accountHolderName, account.getPin(), account.amount);
        this.bankName = bankName;
        this.branchName = branchName;
        this.ifscCode = ifscCode;
        this.account = account;
        this.trasactionId = trasactionId;
    }

    public int getpin() {
        return getPin();
    }
    

    public void calculateInterest() {
        double interest = (super.amount * interestRate) / 100;
        System.out.println("Interest earned: " + interest);
    }
}

class savingsAccount extends Bank{
    int savingamount;
    public savingsAccount(int savingamount, String bankName, String branchName, String ifscCode, Account account, double interestRate) {
        super(bankName, branchName, ifscCode, account, 0);
        super.interestRate = interestRate;
        this.savingamount = savingamount;
    }

    void savings(){
        int savings=10000;
        savingamount=savings+savingamount;
        System.out.println("Savings Amount: " + this.savingamount);
    }
    @Override
    public void calculateInterest() {
        double interest = (this.savingamount * interestRate) / 100;
        System.out.println("Interest earned: " + interest);
    }
}

class Status extends Bank{
    double overdraftLimit;

    public Status(String bankName, String branchName, String ifscCode, Account account) {
        super(bankName, branchName, ifscCode, account, 0); 
    }

    public void checkOverdraft() {
        if (super.amount < 0) {
            System.out.println("Overdraft limit exceeded. Current balance: " + super.amount);
        } else {
            System.out.println("Current balance: " + super.amount);
        }
    }

    void status(){
        if(super.amount > 0){
            System.out.println("Account is Active");
        }else{
            System.out.println("Account is Inactive");
        }
    }

    private void DisplayAccountDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Branch Name: " + branchName);
        System.out.println("IFSC Code: " + ifscCode);
        System.out.println("Transaction ID: " + trasactionId);
        System.out.println("Account Number: " + super.accountNumber);
        System.out.println("Account Holder Name: " + super.accountHolderName);
        System.out.println("Current Balance: " + super.amount);
    }

    public void showAccountDetails() {
        DisplayAccountDetails();
    }

}

public class BankSystem {
   public static void main(String[] args) {
    System.out.println("Welcome to Bank System");
    Status s= new Status("SBI", "Andhra Pradesh", "SBI234C0001", new Account(123456, "Susmitha", 1234, 50000));
    Scanner sc = new Scanner(System.in);
    savingsAccount sa = new savingsAccount(10000, "SBI", "Andhra Pradesh", "SBI234C0001", new Account(123456, "Susmitha", 1234, 50000), 0.1800);
    while(true){
    System.out.print("1- Debit\n2- Credit\n3- Check Overdraft\n4- Calculate Interest\n5- Show Account Details\n6- Check Status\n7- Exit\nEnter choice): ");
    int choice = sc.nextInt();
    switch (choice) {
        case 1:
            System.out.print("Enter debit amount: ");
            int debitAmount=sc.nextInt();
            s.debit(debitAmount, "susmithaa", 1234);
            break;
        case 2:
            System.out.print("Enter credit amount: ");
            int creditAmount = sc.nextInt();
            s.credit(creditAmount, "Microsoft");
            break;
        case 3:
            s.checkOverdraft();
            break;
        case 4:
            System.out.print("Enter savings amount: ");
            sa.savings();
            sa.calculateInterest();
            break;
        case 5:
            s.showAccountDetails();
            break;
        case 6:
            s.status();
            break;
        case 7:
            System.exit(0);
            break;
        default:
            System.out.println("Invalid choice");
    }
   }
}
}
