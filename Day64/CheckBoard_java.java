// package Day64;

public class CheckBoard_java {
    

    static void checkBoardPattern(int n){
        for(int i=1;i<=n; i++){
            for(int j=1; j<=n; j++ ){
                if((i+j)%2 == 0){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        checkBoardPattern(5);
    }
}
