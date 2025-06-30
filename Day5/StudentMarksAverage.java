package day5;
import java.util.*;

public class StudentMarksAverage {
	 public static void main(String[] args) {
	        // Create a HashMap to store student name and marks
	        HashMap<String, Integer> studentMarks = new HashMap<>();

	        // Add sample data
	        studentMarks.put("Arun", 85);
	        studentMarks.put("Bala", 90);
	        studentMarks.put("Chitra", 78);
	        studentMarks.put("Divya", 92);

	        // Display all student marks
	        System.out.println("Student Marks:");
	        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
	            System.out.println(entry.getKey() + " : " + entry.getValue());
	        }

	        // Compute average marks
	        int total = 0;
	        for (int marks : studentMarks.values()) {
	            total += marks;
	        }

	        double average = (double) total / studentMarks.size();
	        System.out.println("Average Marks: " + average);
	    }
	}


