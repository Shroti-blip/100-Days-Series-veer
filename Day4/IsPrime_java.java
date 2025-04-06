// package 100_Days_Series.Day4;

public class IsPrime_java {
    
    public static String isPrime(int num){
        if(num ==1 || num ==2){
            return "base case";
        }
        for(int i =2; i<=num/2; i++){
            if(num%i == 0){
                return "number is not a prime number";
            }
        }
        return "number is  prime number";
    }

    public static void main(String[] args) {
       String c =  isPrime(21);
        System.out.println(c);
    }
}
