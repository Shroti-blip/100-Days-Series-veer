// package Day27;

import java.util.Scanner;

public class HCF_java {
    

    public static int getHCF(int num1 , int num2){
        if(num2 == 0){
            return num1;
        }
        return getHCF( num2 , num1 % num2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 : ");
        int num1 =sc.nextInt();
        System.out.println("Enter num2 : ");
        int num2 = sc.nextInt();
        int result = getHCF(num1, num2);
        System.out.println(" Result is : "+result);
    }
}
