package day6;

public class MessagePrinter implements Runnable {
	private String message;

    // Constructor
    public MessagePrinter(String message) {
        this.message = message;
    }

    // Override run method
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(message + " - " + i);
            try {
                Thread.sleep(500); // optional delay
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }

    public static void main(String[] args) {
        // Create Runnable instances with different messages
        Runnable task1 = new MessagePrinter("Thread A");
        Runnable task2 = new MessagePrinter("Thread B");

        // Create Thread objects
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        // Start the threads
        thread1.start();
        thread2.start();
    }
}


