public class Wife implements Runnable {
    private BankAccount account;

    public Wife(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        account.deposit(10000);
        System.out.println(Thread.currentThread().getName() + ": " + account.getBalance());
    }
}
