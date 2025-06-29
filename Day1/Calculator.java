package basic.corejava;
import java.util.Scanner;

public class Calculator {
	
	    static double calculate(double a, double b, int op) {
	        switch (op) {
	            case 1: return a + b;
	            case 2: return a - b;
	            case 3: return a * b;
	            case 4: return (b != 0) ? a / b : Double.NaN;
	            default: return Double.NaN;
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int choice;
	        do {
	            System.out.println("\n1.Add 2.Subtract 3.Multiply 4.Divide 5.Exit");
	            System.out.print("Choice: ");
	            choice = sc.nextInt();
	            if (choice >= 1 && choice <= 4) {
	                System.out.print("Enter two numbers: ");
	                double a = sc.nextDouble(), b = sc.nextDouble();
	                double result = calculate(a, b, choice);
	                System.out.println(Double.isNaN(result) ? "Error" : "Result: " + result);
	               break;
	            }
	        } while (choice != 5);
	        sc.close();
	    }
	}

	


