import java.util.*;

public class S13Q2 implements Runnable {
    private String threadName;

    public S13Q2(String name) {
        this.threadName = name;
    }

      public void run() {
        System.out.println("Thread " + threadName + " started.");
        Random random = new Random();

        try {
            // Sleep for a random amount of time between 0 and 4999 milliseconds
            int sleepTime = random.nextInt(5000);
    System.out.println("Thread " + threadName + " sleeping for " + sleepTime + " milliseconds");
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread " + threadName + " finished.");
    }

    public static void main(String[] args) 
    {
        System.out.println("Main thread started.");
        S13Q2 demo1 = new S13Q2("Thread 1");
        S13Q2 demo2 = new S13Q2("Thread 2");

        Thread thread1 = new Thread(demo1);
        Thread thread2 = new Thread(demo2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread finished.");
    }
}
