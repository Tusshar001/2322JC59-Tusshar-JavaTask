package basic.corejava;

import java.util.Scanner;
public class StudentMarks {
	
	public static void main(String[] args) {
		
             {
		        Scanner sc = new Scanner(System.in);

		        
		        System.out.print("Enter student name: ");
		        String name = sc.nextLine();

		        System.out.print("Enter number of subjects: ");
		        int n = sc.nextInt();

		        int[] marks = new int[n];
		        int total = 0;

		       
		        for (int i = 0; i < n; i++) {
		            System.out.print("Enter marks for subject " + (i + 1) + ": ");
		            marks[i] = sc.nextInt();
		            total += marks[i];
		        }

		        double average = (double) total / n;
		        double percentage = ((double) total / (n * 100)) * 100;  
		        
		        System.out.println("\n--- Student Report ---");
		        System.out.println("Name       : " + name);
		        System.out.println("Total Marks: " + total);
		        System.out.println("Average    : " + average);
		        System.out.println("Percentage : " + percentage + "%");

		        sc.close();
		    }
		}

	}

