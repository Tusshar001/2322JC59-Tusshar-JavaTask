package day4;
import java.io.*;

public class WriteToFile {
	  public static void main(String[] args) {
	        try {
	            // Create a FileWriter (it will create the file if it doesn't exist)
	            FileWriter fileWriter = new FileWriter("output.txt");

	            // Wrap FileWriter in BufferedWriter for easy writing
	            BufferedWriter writer = new BufferedWriter(fileWriter);

	            // Write strings line by line
	            writer.write("Hello, this is line 1.");
	            writer.newLine();
	            writer.write("This is line 2.");
	            writer.newLine();
	            writer.write("And this is line 3.");
	            
	            // Close the writer
	            writer.close();

	            System.out.println("Data written to file successfully.");
	        } catch (IOException e) {
	            System.out.println("An error occurred: " + e.getMessage());
	        }
	    }
	}


