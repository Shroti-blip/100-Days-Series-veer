// package 100_Days_Series.Day22;

import java.util.Scanner;

public class Armstrong_java {

    //Function to calculate number of digits. (Recursive function)

    static int countDigit(int num){
        if (num==0) return 0;//base case for this function.
        return 1 + countDigit(num/10);
    }

    //Recursive function to calculate the sum of powered digits.

    static int powerSum(int num , int digits){
        if(num == 0) return 0;
       int digit = num % 10;
        return (int)Math.pow(digit, digits) + powerSum(num/10, digits);
    }

    //Main function to check armstrong number

    static boolean isArmstrong(int num){
        int digits = countDigit(num);
        int sum = powerSum(num, digits);
        return num == sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();

        if(isArmstrong(num)){
            System.out.println("Given Number is Armstrong.");
        }
        else{
            System.out.println("Number is not Armstrong.");
        }

        // int store = countDigit(num);
        // System.out.println(store);
    }
}
