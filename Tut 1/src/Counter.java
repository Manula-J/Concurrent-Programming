public class Counter {
    private int count;

    public Counter() {
        count = 0;
    }

    public synchronized int increment() {
        count++;
        return count;
    }

    public void printCount() {
        System.out.println("The counter is " + this.count);
    }
}
