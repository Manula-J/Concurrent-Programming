public class Husband implements Runnable {
    private BankAccount account;

    public Husband(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        account.withdraw(20000);
        System.out.println(Thread.currentThread().getName() + ": " + account.getBalance());
    }
}
