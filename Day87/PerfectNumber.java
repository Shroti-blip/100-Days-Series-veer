// package 100_Days_Series.Day87;

import java.util.Scanner;

public class PerfectNumber {
    
    public static void perfectNum(int n){
        for(int i=1; i*i<=n; i++){
            System.out.println(i*i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter a Number: ");
        int n=sc.nextInt();
       perfectNum(n);
    }
}
