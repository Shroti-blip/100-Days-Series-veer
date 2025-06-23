// package Day67;

public class AlphabetPalindrom {
    
    public static void alphabetPalindrom(int n){
        for(int i=1; i<=n; i++){
            char ch = 'A';
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i-1); j++){
                System.out.print( ch++ );
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        alphabetPalindrom(5);
    }
}
