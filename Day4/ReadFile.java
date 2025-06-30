package day4;
import java.io.*;

public class ReadFile {
	 public static void main(String[] args) {
	        try {
	            // Create a FileReader for the file
	            FileReader fileReader = new FileReader("sample.txt");

	            // Wrap FileReader in BufferedReader
	            BufferedReader reader = new BufferedReader(fileReader);

	            String line;

	            // Read and print lines until end of file
	            while ((line = reader.readLine()) != null) {
	                System.out.println(line);
	            }

	            // Close the reader
	            reader.close();
	        } catch (IOException e) {
	            System.out.println("An error occurred: " + e.getMessage());
	        }
	    }
	}


