// package Day76;

public class SumOfRow {
    

    public static void main(String[] args) {
        int[][] matrix= {
            {1,2,3},
            {3,6,8},
            {7,5,4}
        } ;

        int rowidx = 2;
        int sum =0;
        for (int num : matrix[rowidx]){
            sum += num;
        }
        System.out.println(sum);
    }
}
