public class NumberThread extends Thread {
    NumberThread(){
        super();
    }

    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }
    }
}
