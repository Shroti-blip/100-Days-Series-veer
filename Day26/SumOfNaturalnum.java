// package Day26;

public class SumOfNaturalnum {
    

    public static int sumofNaturalNum(int num){
        int sum = 1;
        for(int i = 1; i<=num; i++){
            sum += i;
        }
        return sum;
    }

    //Recursive function

    public static int sumByRecursion(int num){
        int sum = 0;
        if(num == 1){
            return 1;
        }
        return sum + sumByRecursion(num--);
    }

    public static void main(String[] args) {
        int num = 10;
        int result = sumofNaturalNum( num);
        System.out.println(result);
        
        int result2 = sumofNaturalNum( num);
        System.out.println(result2);
    }
}
