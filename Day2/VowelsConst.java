package basic.corejava;
import java.util.Scanner;

public class VowelsConst {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("Enter a String:");
    	
    	String text = scanner.nextLine();
    	
    	scanner.close();
        
        int vowelCount = 0;
        int consonantCount = 0;
        text = text.toLowerCase();

        for (char ch : text.toCharArray()) { 
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }
        System.out.println("Vowels: " + vowelCount + ", Consonants: " + consonantCount);
    }
}


