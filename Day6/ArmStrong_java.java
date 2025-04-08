// package 100_Days_Series.Day6;

public class ArmStrong_java {
   static int num = 153;
   static int original = num;
    public static int isArmStrong(int num){
       int n = isPower(num);
       int result = 0;
       
        while (num != 0) {
            int digit = num % 10;
            result += Math.pow(digit, n);
            num /= 10;
        }
        return result;
    }

    public static int isPower(int num){
        int count = 0;
        while(num!=0){
            num /=10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
  
      int c =   isArmStrong(num);
      if(c == original){
        System.out.println("number is armstrong");
      }
      else{
        System.out.println("not armstrong");
      }
    }
}
