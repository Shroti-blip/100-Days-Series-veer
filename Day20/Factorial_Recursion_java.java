// package Day20;

public class Factorial_Recursion_java {
    
    public static int getFactorial(int num){
        if(num == 0 || num == 1){
            return 1;
        }
       return num * getFactorial(num -1);
    }

    public static void main(String[] args) {
         
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter number for Factorial: ");
        int num = sc.nextInt();

        int result = getFactorial(num);
        System.out.println("Answer is : " + result); 


    }
}
