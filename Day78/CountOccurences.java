public class CountOccurences {

    static int find(int[][]  matrix , int target){
        int row = matrix.length;
        int col = matrix[0].length;
        int count =0;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(matrix[i][j] == target){
                    count++;
                }
                // return count;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3},{4,3,4},{6,7,8}
        };
        int target = 3;
       int ans =  find(matrix , target);
       System.out.println(ans);
    }
}