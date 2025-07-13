// package 100_Days_Series.Day89;

public class CountEvenOdd {
  
    static void evenOdd(int n){
          int even=0 , odd =0;
        for(int i=1; i<=n; i++){
            if(i%2 == 0){
                even++;
            }
          else{
            odd++;
          }
        }
        System.out.println("Even number are: " + even);
        System.out.println("Odd number are: " + odd);
    }
public static void main(String[] args) {
    evenOdd(22);
}
}
