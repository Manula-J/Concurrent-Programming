public class BankAccount {
    private double balance;
    private String accountNumber;

    public BankAccount(String accountNumber, double balance) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

     public double getBalance() {
         return balance;
     }

     public String getAccountNumber() {
         return accountNumber;
     }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount) {
         if (amount <= 0) {
             throw new IllegalArgumentException("Amount must be greater than 0");
         }

         this.balance += amount;
         System.out.println("Deposited " + amount + " to " + accountNumber);
    }

    public void withdraw(double amount) {
         if (this.balance < amount) {
             throw new IllegalArgumentException("Insufficient balance");
         } else {
             this.balance -= amount;
             System.out.println("Withdrawn " + amount + " from " + accountNumber);
         }
    }
}
