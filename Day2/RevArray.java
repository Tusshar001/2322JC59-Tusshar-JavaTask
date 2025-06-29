package basic.corejava;

import java.util.Arrays;

public class RevArray {
	public static void main(String[] args) {
    
		String []bikes = {"KTM", "Pulsar" , "Re", "benelli", "Ninja" };
		
		  System.out.println("Original Array: " + Arrays.toString(bikes));

	        int n = bikes.length;

	       
	        for (int i = 0; i < n / 2; i++) {
	           
	            String temp = bikes[i]; 
	            bikes[i] = bikes[n - 1 - i]; 
	            bikes[n - 1 - i] = temp;
	        }

	        System.out.println("Reversed Array : " + Arrays.toString(bikes));
	    }
	}
