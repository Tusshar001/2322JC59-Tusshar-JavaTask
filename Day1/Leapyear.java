package basic.corejava;
import java.util.Scanner;

public class Leapyear {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int year =0;
		
		System.out.println("Enter the Year: ");
		year= scanner.nextInt();
		
		scanner.close();
		
		if(year % 4 == 0 && year % 100 != 0)
		{
			System.out.println(year + " is a Leapyear");
		}else {
			System.out.println(year +  " is not a Leapyear");
		}
	}
}


