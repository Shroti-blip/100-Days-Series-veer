// package Day79;

import java.util.Scanner;

public class ConvertNumToString {
    
    static String[] word = {"zero","one","two","three","four","five","six","seven","eight","nine"};

    public static String convert(int num){
        if(num ==0){
            return "";
        }
       String result = convert(num/10);
       result += word[num%10];
       return result;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num: ");
        int num = sc.nextInt();
      String s=  convert(num);
      System.out.println(s);
    }
}
