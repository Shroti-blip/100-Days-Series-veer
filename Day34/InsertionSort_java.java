import java.util.Arrays;

public class InsertionSort_java {


    static void insertion(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j>0; j--){
  // shifting the current element (at j) backward through the sorted part of the array until it finds its correct place.
                if(arr[j] <arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else{
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] arr={4,5,2,3,1};
        insertion(arr);
        System.err.println(Arrays.toString(arr));
    }
}