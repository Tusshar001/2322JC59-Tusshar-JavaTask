package basic.corejava;

import java.util.Scanner;

public class Simpleinterest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Principal (P):");
	    double p = s.nextDouble();
		
		System.out.println("Rate (R) in %:");
		double r = s.nextDouble();
		
		System.out.println("Time (T) in years:");
		double t =s.nextDouble();
		
		s.close();
		
		double interest = (p * r * t)/100;
		System.out.println("Simple Interest = $" + interest);
		
	}

}
