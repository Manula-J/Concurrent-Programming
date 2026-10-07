public class Mother implements Runnable {
    private final Plate plate;

    public Mother(Plate plate) {
        this.plate = plate;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            plate.Put("Food " + i);
            System.out.println(Thread.currentThread().getName() + ": Cooked " + i);
        }
    }

}
