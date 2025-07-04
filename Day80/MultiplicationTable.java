// package Day80;

import java.util.Scanner;

public class MultiplicationTable {
    

    static void getTable(int num){
        for(int i=1; i<=10; i++){
            System.out.println(i*num);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        System.out.println("Here is the Table of " + num);
        getTable(num);
    }
}
