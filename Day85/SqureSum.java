package Day85;
// package Day84;

import java.util.Scanner;

public class SqureSum {
   
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int sum = (n *(n+1) * (2*(n+1))/6);
        System.out.println(sum);
    }
}
