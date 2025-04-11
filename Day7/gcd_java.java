
public class gcd_java{

     //Function to calculate GCD using the Euclidean algorithm
    //gcd == Greatest Common Divisior or in other word it is HCF
    public static int find_gcd(int num1 , int num2){
        while(num2!=0){
            int remainder = num1%num2;
            num1 = num2;
            num2 = remainder;
        }
        return num1;
    }


    public static void main(String[] args){
        int num1 = -96;
        int num2 = 54;

        //Ensure the numbers are positive 
        if(num1<0)
            num1=-num1;//It means "make the number positive", even if it's negative.
        if(num2<0)
            num2=-num2;//It means "make the number positive", even if it's negative.

        int ans = find_gcd(num1, num2);
        System.out.println("gcd of " +num1 + " and "+ num2 +" is : " + ans);
    }
}