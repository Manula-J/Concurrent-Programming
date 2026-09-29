public class MyThread extends Thread{
    MyThread(String name){
        super(name);
    }

    @Override
    public void run(){
        super.run();
        System.out.println("I am " + Thread.currentThread().getName());
    }
}