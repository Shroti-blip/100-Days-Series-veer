// package 100_Days_Series.Day56;

public class HollowRectangle {
    
    public static void hollowRect(int row , int col ){
        for(int i=1; i<=row; i++){
            for(int j=1; j<=col; j++){
                if(j==1 ||  j==col || i==1 || i==row){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
             System.out.println();
        }
    }


    public static void main(String[] args) {
        int row =5;
        int col = 5;

        hollowRect(row , col);
    }
}
