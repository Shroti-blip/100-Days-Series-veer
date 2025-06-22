public class InvertedPyramidAlphabet {
    

    public static void pattern(int r){
          for(int i=r; i>=1; i--){
            char ch = 'A';
            for(int j=1; j<=i; j++){
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        pattern(5);
    }
}