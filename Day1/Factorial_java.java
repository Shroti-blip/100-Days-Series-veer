// package 100_Days_Series.Day1;

import java.util.Scanner;

public class Factorial_java {
    
    public static int getFactorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        if(n<0){
            return -1;
        }
        else{
            int fact = 1;
            for(int i =1; i<=n; i++){
                fact = fact * i;
            }
         return fact;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int c = getFactorial(n);
        System.out.println(c);
    }
}
