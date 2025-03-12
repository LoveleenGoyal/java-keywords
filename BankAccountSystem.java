class BankAccounts {
    // Static variable shared across all accounts
    private static String bankName = "ABC Bank";
    private static int totalAccounts = 0;

    // Instance variables
    private String accountHolderName;
    private final int accountNumber; // Final variable to ensure it cannot be changed
    private double balance;

    // Constructor
    public BankAccounts(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        totalAccounts++; // Increment total accounts
    }

    public void displayAccountDetails() {
        if(this instanceof BankAccounts) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Balance: " + balance);
        }
    }

    public static void getTotalAccounts() {
        System.out.println("Total Bank Accounts: " + totalAccounts);
    }
}

// Main class to test the BankAccount class
public class BankAccountSystem {
    public static void main(String[] args) {
        BankAccounts acc1 = new BankAccounts(1001, "Loveleen", 500000);
        BankAccounts acc2 = new BankAccounts(1002, "Yagyata", 300000);

        System.out.println("====Account 1====");
        acc1.displayAccountDetails();
        System.out.println("\n====Account 2====");
        acc2.displayAccountDetails();

        System.out.println();
        BankAccounts.getTotalAccounts();
    }
}

/*====Account 1====
Bank Name: ABC Bank
Account Number: 1001
Account Holder: Loveleen
Balance: 500000.0

====Account 2====
Bank Name: ABC Bank
Account Number: 1002
Account Holder: Yagyata
Balance: 300000.0

Total Bank Accounts: 2
*/
