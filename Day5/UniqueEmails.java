package day5;
import java.util.*;

public class UniqueEmails {
	public static void main(String[] args) {
        // Create a HashSet to store unique email addresses
        HashSet<String> emailSet = new HashSet<>();

        // Add email addresses
        emailSet.add("jaanu@example.com");
        emailSet.add("angel@example.com");
        emailSet.add("vimal@example.com");  // Duplicate
        emailSet.add("surya@example.com");

        // Display the unique email addresses
        System.out.println("Unique Email Addresses:");
        for (String email : emailSet) {
            System.out.println(email);
        }
    }
}


