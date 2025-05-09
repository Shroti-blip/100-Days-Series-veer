// package Day21;

public class FibonacchiRecursion_java {
    
    public static int getFibonacchi(int n){
        if(n<=1){
            return 1;
        }
        return  getFibonacchi(n-1) + getFibonacchi(n-2) ;
    }

    public static void main(String[] args) {
        int n = 9;
       for(int i =0; i<n; i++){
        System.out.print(getFibonacchi(i) + " ");
       }

    }
}
