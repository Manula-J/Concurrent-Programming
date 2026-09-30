package Ex3;

public class Producer implements Runnable {
    private SingleSlot singleSlot;

    public Producer(SingleSlot s) {
        this.singleSlot = s;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}
