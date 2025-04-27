package Day8;
// package 100_Days_Series;

public class lcm_in_java {

    public static int getGCD(int num1, int num2){
        while(num2 != 0){
            int remainder = num1%num2;
            num1 = num2;
            num2 = remainder;
        }
        return num1;
    }

    public static int getLCM(int num1 , int num2){
        int gcd= getGCD(num1, num2);
       return  num1*num2/gcd;
    }

    public static void main(String[] args) {
        
       int num1=12;
       int num2=15;
       if(num1<0){
        num1 = -num1;
       }
      if(num2 < 0){
        num2 = -num2;
      }

      int c = getLCM(num1, num2);
      System.out.println(c);
    }
}
