package BruteForce;
class RotateMatrix90deg{




    public static void main(String[] args) {
        
         int m[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
         };

         int n = m.length;
         int[][] rotated = new int[3][3];

         for(int i=0; i<m.length; i++){
            for(int j=0; j<m[0].length; j++){
               rotated[j][n-1-i] = m[i][j] ;
            }
         }

            System.out.println("Rotated Matrix");
         for(int[] row : rotated){
            for(int num : row){
                System.out.print(num + " ");
            }
            System.out.println();
         }

         System.out.println("Original matrix : ");
         
    

    }
}