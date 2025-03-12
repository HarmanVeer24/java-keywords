// Main class to test the BankAccount class
public class BankAccountSystem {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(101, "Aman", 500000);
        SavingsAccount acc2 = new SavingsAccount(102, "Harman", 300000, 4.5); // Savings Account with interest rate

        acc1.displayAccountDetails();
        acc2.displayAccountDetails(); // Will display extra details for SavingsAccount

        // Display total accounts
        BankAccount.displayTotalAccounts();
    }
}

// Base class: BankAccount
class BankAccount {
    protected static String bankName = "Central Bank"; // Static variable shared across all accounts
    protected static int totalAccounts = 0; // Static counter for total accounts
    protected final int accountNumber; // Final variable that cannot be changed
    protected String accountHolderName;
    protected double balance;

    // Constructor
    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        totalAccounts++; // Increment total accounts
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);

        // Using instanceof before casting to prevent runtime errors
        if (this instanceof SavingsAccount) {
            SavingsAccount sa = (SavingsAccount) this;
            System.out.println("Interest Rate: " + sa.getInterestRate() + "%");
        }
    }

    // Static method to display total accounts
    public static void displayTotalAccounts() {
        System.out.println("Total Bank Accounts: " + totalAccounts);
    }
}

// Subclass: SavingsAccount
class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor
    public SavingsAccount(int accountNumber, String accountHolderName, double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }
}

//output
//Bank Name: Central Bank
//Account Number: 101
//Account Holder: Aman
//Balance: 500000.0
//Bank Name: Central Bank
//Account Number: 102
//Account Holder: Harman
//Balance: 300000.0
//Interest Rate: 4.5%
//Total Bank Accounts: 2
