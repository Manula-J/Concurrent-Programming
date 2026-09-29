public class Main {
    public static void main(String[] args) {

        // Q3
//        Thread t2 = new Thread(() -> {
//            for (int i = 1; i < 10; i++) {
//                System.out.println(i);
//            }
//        });
//        t2.start();


        // Q7
        Counter counter = new Counter();

        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                int currentCount = counter.increment();
                System.out.println(Thread.currentThread().getName() + " incremented counter to: " + currentCount);

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted");
                }
            }
        };

        Thread tDataProcessor = new Thread(task, "DataProcessor");
        Thread tReportGenerator = new Thread(task, "ReportGenerator");

//        Thread tDataProcessor = new Thread(() -> {
//            for (int i = 0; i < 5; i++) {
//                int currentCount = counter.increment();
//                System.out.println(Thread.currentThread().getName() + " incremented counter to: " + currentCount);
//            }
//
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                System.out.println("Thread interrupted");
//            }
//        }, "DataProcessor");
//
//        Thread tReportGenerator = new Thread(() -> {
//            for (int i = 0; i < 5; i++) {
//                int currentCount = counter.increment();
//                System.out.println(Thread.currentThread().getName() + " incremented counter to: " + currentCount);
//            }
//
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                System.out.println("Thread interrupted");
//            }
//        }, "ReportGenerator");

        tDataProcessor.start();
        tReportGenerator.start();

        try {
            tDataProcessor.join();
            tReportGenerator.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        counter.printCount();
    }
}