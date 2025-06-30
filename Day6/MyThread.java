package day6;

 class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - Count: " + i);
            try {
                Thread.sleep(500); // Sleep for 0.5 seconds
            } catch (InterruptedException e) {
                System.out.println(getName() + " was interrupted.");
            }
        }
    }
}

public class SleepAndJoinDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.setName("Thread A");

        MyThread t2 = new MyThread();
        t2.setName("Thread B");

        t1.start();

        try {
            // Main thread waits until t1 finishes
            t1.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted while waiting for t1.");
        }

        t2.start();
    }
} 


