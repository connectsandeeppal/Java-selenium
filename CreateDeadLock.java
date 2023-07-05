public class CreateDeadLock {
    private static final Object resource1 = new Object();
    private static final Object resource2 = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: Holding resource1...");
                try { Thread.sleep(100); } catch (InterruptedException e) {}
                System.out.println("Thread 1: Waiting for resource2...");
                synchronized (resource2) {
                    System.out.println("Thread 1: Holding resource1 and resource2...");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2: Holding resource2...");
                try { Thread.sleep(100); } catch (InterruptedException e) {}
                System.out.println("Thread 2: Waiting for resource1...");
                synchronized (resource1) {
                    System.out.println("Thread 2: Holding resource2 and resource1...");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
