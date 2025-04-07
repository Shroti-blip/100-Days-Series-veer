// package 100_Days_Series.Day5;

public class Palindrom_java {
    
    public static int isPalindrom(int num){
        int reversed = 0;
       while(num!=0){
       reversed = (reversed *10) + num%10;
       num /=10; 
       }
       return reversed;
    }

    public static void main(String[] args) {
        int num = 12321;
        int result = isPalindrom(num);
        if(result == num){
            System.out.println("number is a palindrom number");
        }
        else{
            System.out.println("number is not palindrom");
        }
    }
}
