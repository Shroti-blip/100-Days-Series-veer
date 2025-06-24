// package Day68;

public class HourglassNumberPattern {
    
    public static void hourGlassPattern( int n){
         for(int i=n; i>=1; i--){
        for(int j=1; j<=(n-i); j++){
            System.out.print(" ");
        }
        for(int j=1; j<=(2*i-1); j++){
            System.out.print(j);
        }
        System.out.println();
    }

        for(int i=2; i<=n; i++){
        for(int j=1; j<=(n-i); j++){
            System.out.print(" ");
        }
        for(int j=1; j<=(2*i-1); j++){
            System.out.print(j);
        }
        System.out.println();
    }
    }
    
    public static void main(String[] args) {
    hourGlassPattern(5);
    }
}
