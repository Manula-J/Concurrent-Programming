public class Main {
    public static void main(String[] args) {
//        MyThread t1 = new MyThread("worker 1");
//        MyThread t2 = new MyThread("worker 2");
//
//        System.out.println(Thread.currentThread().getName());
//
//        t1.start();
//        t2.start();
//
//        MyThread2 t1r = new MyThread2();
//        Thread t3 = new Thread(t1r, "worker 3");
//
//        t3.start();
//
//        Thread t4 = new Thread(){
//            @Override
//            public void run() {
//                System.out.println(Thread.currentThread().getName());
//            }
//        };
//        t4.start();
//
//        Thread t5 = new Thread(() -> {
//            System.out.println(Thread.currentThread().getName());
//        }, "worker 5");
//
//        t5.setDaemon(true);
//        t5.start();
////        t5.setPriority(Thread.MAX_PRIORITY);

        BankAccount account = new BankAccount( "124587956542", 10000);

        Wife wife = new Wife(account);
        Husband husband = new Husband(account);

        Thread wifeThread = new Thread(wife, "Wife");
        Thread husbandThread = new Thread(husband, "Husband");

        wifeThread.start();
        husbandThread.start();
    }
}