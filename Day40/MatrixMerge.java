// package 100_Days_Series.Day40;

public class MatrixMerge {
    


    public static void main(String[] args) {
      int[][] matrix1 = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};


 int[][] matrix2 = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};



        if(matrix1.length != matrix2.length && matrix1[0].length !=matrix2.length){
            System.out.println("Matrix size is not same.");
            return;
        }
         int [][] result = new int[3][3];

        for(int i=0; i<matrix1.length; i++){
           for(int j=0; j<matrix1[0].length; j++){
            result[i][j] = matrix1[i][j] +matrix2[i][j];
            }
        }

        for(int i=0; i<matrix1.length; i++){
            
            for(int j=0; j<matrix1[0].length; j++){
                System.out.print(result[i][j]+",");
            }
            System.out.println( );
        }
       
    }
}
