package Ex1;

public class Counter {
    private int count;

    public Counter() {
        count = 0;
    }

    public synchronized void incrementAndGet() {
//        count++;                   This equals to ->
        int newC = this.count;
        newC = newC + 1;
        this.count = newC;
    }

    public int showCount() {
        return this.count;
    }
}
