public class Child implements Runnable {
    private final Plate plate;

    public Child(Plate plate) {
        this.plate = plate;
    }

    @Override
    public void run() {
        String food;
        for (int i = 0; i < 10; i++) {
            food = plate.Get();
            System.out.println(Thread.currentThread().getName() + ": ate " + food );
        }
    }
}
