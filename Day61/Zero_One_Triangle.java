// package 100_Days_Series.Day60;

public class Zero_One_Triangle {

    public static void zeroOneTriangle(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2 == 0){
                    System.out.print(0 +" ");
                }
                else{System.out.print(1 + " ");}
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        int n=5;
        zeroOneTriangle(n);
    }
    
}
