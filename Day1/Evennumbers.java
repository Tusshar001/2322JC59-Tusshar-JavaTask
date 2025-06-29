package basic.corejava;


public class Evennumbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i <= 100; i += 3) {
                    
            if (i % 5 == 0) {
            	sum += i;
            	System.out.println(i +":add:"+sum+" to sum");
        }
             }
        System.out.println( + sum);
        }
}

  

