// package 100_Days_Series.Day58;

public class Floydtriangle {
    
    public static void floydTrian(int n){
          int num =1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int n =5;
        floydTrian(n);
    }
}
