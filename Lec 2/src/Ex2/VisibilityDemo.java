package Ex2;

public class VisibilityDemo {
    private volatile boolean flag = false;

    public void changeFlag() {
        this.flag = true;
    }

    public boolean checkFlag() {
        return this.flag;
    }

    public static void main(String[] args) throws InterruptedException {
        VisibilityDemo demo = new VisibilityDemo();

        Thread t1 = new Thread(() -> {
            int i = 0;
            while (!demo.checkFlag()) {
                i++;
            }
            System.out.println("Execution is over " + i);
        });

        t1.start();

        System.out.println("Thread is executing");

        Thread.sleep(200);
        System.out.println("Going to call check flag" );
        demo.changeFlag();
        t1.join();

        System.out.println("Program stopped");
    }
}
