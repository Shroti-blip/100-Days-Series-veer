// package Day16;

import java.util.Scanner;

public class DecToBIn_java {
    
    public static int dec_to_bin( int num){
        int binary=0; 
        int place=1;
        
        while(num != 0){
            
            int remainder = num % 2;
            binary += remainder *place;
             num = num /2;
            place *= 10;

        }
        return binary;
    }

    public static void main(String[] args) {
       System.out.println("Enter a Decimal number: ");
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       int result = dec_to_bin(num);
       System.out.println("This is the Binary form : " + result + " of decimal number number: " +num);
    }
}
