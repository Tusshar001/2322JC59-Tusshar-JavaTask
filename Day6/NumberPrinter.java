package day6;

class NumberPrinter extends Thread {
	 public void run() {
	        for (int i = 1; i <= 10; i++) {
	            System.out.println("Number: " + i);
	            try {
	                Thread.sleep(500); // pause for 500 milliseconds
	            } catch (InterruptedException e) {
	                System.out.println("Thread interrupted.");
	            }
	        }
	    }

	    public static void main(String[] args) {
	        NumberPrinter thread = new NumberPrinter(); // create thread object
	        thread.start(); // start the thread
	    }
	}


