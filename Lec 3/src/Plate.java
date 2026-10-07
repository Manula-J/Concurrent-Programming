public class Plate{
    private String slot;
    private boolean available = true;

    public void Put(String food){
        while(available){
            try{
                wait();
            } catch(InterruptedException e){
                throw new RuntimeException(e);
            }

        }
        this.slot = food;
        this.available = true;
    }

    public String Get(){
        while(!available){
            try {
                wait();
            } catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }

        String value = slot;

        notifyAll();
        this.available = false;

        return slot;
    }
}