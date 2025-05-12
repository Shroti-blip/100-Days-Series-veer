import java.util.Scanner;

public class PowerOfNum {
    
//Normal function

public static int powerNum(int base , int exp){
     int res = 1;
    while(exp != 0){
        if(exp == 0){
            return 1;
        }
       
        res *= base;
        exp--;
    }
    return res;
}


//Recursive function for that.

public static int powerNumRecursive(int base , int exp){

    if(exp == 0){
        return 1;
    }
    return base * powerNumRecursive(base, --exp);
}
    public static void main(String[] args) {
        int num,power;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number value: ");
        num = sc.nextInt();
        System.out.println("Enter power value: ");
        power = sc.nextInt();
        int result = powerNum( num , power);
        int result2 = powerNumRecursive(num , power);
        // System.out.println("Answer is : "+ result);
        System.out.println("Answer is : " + result2);
    }
}
