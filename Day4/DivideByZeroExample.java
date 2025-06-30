package day4;

public class DivideByZeroExample {
	  public static void main(String[] args) {
	        int a = 10;
	        int b = 0;

	        try {
	            int result = a / b;
	            System.out.println("Result: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Error: Cannot divide by zero.");
	        }

	        System.out.println("Program continues after handling the exception.");
	    }
	}

