package Ex3;

public class SingleSlot {
    private String food;
    public boolean available;

    public SingleSlot() {
        this.food = null;
        this.available = false;
    }

    public void produce(String food) {
        try {
            wait();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        this.food = food;
        notifyAll();
        this.available = true;
    }

    public String consume() {
        try {
            wait();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        this.available = false;
        notifyAll();
        return food;
    }
}
