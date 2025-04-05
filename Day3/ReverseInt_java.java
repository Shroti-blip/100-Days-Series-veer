// package 100_Days_Series.Day3;

public class ReverseInt_java {
    
    public static int reverseInt(int num){
        int reversed = 0;
        while(num != 0){
            reversed = (reversed * 10)+ num%10;
            num = num/10;
        }
        return reversed;
    }
    public static void main(String[] args) {
        
    int result = reverseInt(1234);
    System.out.println(result);
    }
}
