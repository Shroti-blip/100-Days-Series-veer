
class SearchInTwoDMatrix{


    public static boolean search(int[][] matrix , int target){

        int row = matrix.length;
        int col = matrix[0].length;     
        int low = 0; 
        int high = row * col -1;

        while(low<=high){
            int mid = (low + (high-low)/2);
            int midvalue= matrix[mid/col][mid%col];
            if(midvalue == target){
                return true;
            }
            else if(midvalue<target){
                low = mid +1;
            }
            else{
                high = mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
         int [][]matrix={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int target = 5;
       boolean result = search(matrix, target);
       if(result){
        System.out.println("True");
       }
       else{
        System.out.println("not in array.");
       }

    }
}