public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate();

        Mother mother = new Mother(plate);
        Child child = new Child(plate);

        Thread t1 = new Thread(mother);
        Thread t2 = new Thread(child);

        t1.start();
        t2.start();
    }
}