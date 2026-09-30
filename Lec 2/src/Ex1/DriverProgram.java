package Ex1;

public class DriverProgram {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Runnable task = () -> {
            for (int i = 0; i < 10; i++) {
                counter.incrementAndGet();
                System.out.println(Thread.currentThread().getName() + ": " + counter.showCount());
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread t1 = new Thread(task, "DP");
        Thread t2 = new Thread(task, "RG");

        t1.start();
        t2.start();
    }
}
