public class SynchronizationDemo {
    public static void main(String[] args) {
        // Create two new threads
        Thread t1 = new Thread(new Task());
        Thread t2 = new Thread(new Task());
        
        // Start the threads
        t1.start();
        t2.start();
    }
}

class Task implements Runnable {
    private int counter = 0;
    
    public void run() {
        // Synchronize access to the counter variable
        synchronized(this) {
            for (int i = 0; i < 5; i++) {
                counter++;
                System.out.println("Counter value: " + counter);
            }
        }
    }
}
