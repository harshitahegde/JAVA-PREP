package Module3_Oops;

public class BankAccount {
    private String accountNumber;
    private double balance;
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
    
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("12345", 1000);
        System.out.println("Account Number: " + myAccount.getAccountNumber());
        System.out.println("Initial Balance: " + myAccount.getBalance());
        myAccount.deposit(500);
        System.out.println("Balance after deposit: " + myAccount.getBalance());
        myAccount.withdraw(200);
        System.out.println("Balance after withdrawal: " + myAccount.getBalance());
    }
}