package day5;
import java.util.*;

public class StudentList {
	 public static void main(String[] args) {
	        // Create an ArrayList of Strings (student names)
	        ArrayList<String> students = new ArrayList<>();

	        // Add student names to the list
	        students.add("Arun");
	        students.add("Bala");
	        students.add("Chitra");
	        students.add("Divya");

	        // Create an iterator
	        Iterator<String> iterator = students.iterator();

	        // Display student names using iterator
	        System.out.println("Student List:");
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }
	}


