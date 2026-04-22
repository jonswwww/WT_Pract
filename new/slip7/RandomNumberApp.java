import java.util.Random;

public class RandomNumberApp {

    public static void main(String[] args) {
        RandomNumberGenerator rng = new RandomNumberGenerator();
        NumberSquareCalculator squareCalculator = new NumberSquareCalculator();
        NumberCubeCalculator cubeCalculator = new NumberCubeCalculator();
        
        Thread t1 = new Thread(rng);
        Thread t2 = new Thread(squareCalculator);
        Thread t3 = new Thread(cubeCalculator);

        t1.start();
        t2.start();
        t3.start();
    }

    private static class RandomNumberGenerator implements Runnable {
        private Random random = new Random();

        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(1000);
                    int number = random.nextInt(100);
                    System.out.println("Generated number: " + number);
                    if (number % 2 == 0) {
                        NumberSquareCalculator.addNumber(number);
                    } else {
                        NumberCubeCalculator.addNumber(number);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static class NumberSquareCalculator implements Runnable {
        private static int number;

        public static synchronized void addNumber(int number) {
            NumberSquareCalculator.number = number;
            NumberSquareCalculator.class.notifyAll();
        }

        @Override
        public void run() {
            while (true) {
                try {
                    synchronized (NumberSquareCalculator.class) {
                        NumberSquareCalculator.class.wait();
                        int square = number * number;
                        System.out.println("Square of " + number + ": " + square);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static class NumberCubeCalculator implements Runnable {
        private static int number;

        public static synchronized void addNumber(int number) {
            NumberCubeCalculator.number = number;
            NumberCubeCalculator.class.notifyAll();
        }

        @Override
        public void run() {
            while (true) {
                try {
                    synchronized (NumberCubeCalculator.class) {
                        NumberCubeCalculator.class.wait();
                        int cube = number * number * number;
                        System.out.println("Cube of " + number + ": " + cube);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
