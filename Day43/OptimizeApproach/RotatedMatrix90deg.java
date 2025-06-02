// package OptimizeApproach;

public class RotatedMatrix90deg {
    

    //for transposing a matrix

    public static void transpose(int[][] m){
        for(int i=0; i<m.length; i++){
            for(int j=i+1; j<m[0].length; j++){
                int temp = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = temp;
            }
        }
    }

    //now for rotation.

    public static void rotated(int[][] m){
        for(int i=0; i<m.length; i++){
            int start =0; int end = m.length-1;
            while(start<end){
                int  temp = m[i][start];
                m[i][start] = m[i][end];
                m[i][end] = temp;
                start++;
                end--;
            }
        }
    }

    //print matrix

    public static void printMatrix(int m[][]){
   for(int i=0; i<m.length; i++){
        for(int j=0; j<m.length; j++){
            System.out.print(m[i][j] + " ");
        }
        System.out.println();
    }
     }

 

    public static void main(String[] args) {
        int[][] m = {
            {1,2,3}, 
            {4,5,6}, 
            {7,8,9}
        };

        System.out.println("Original matrix");
       printMatrix(m);
       System.out.println("Rotated matrix: ");
       transpose(m);
       rotated(m);
       printMatrix(m);
    }
}
