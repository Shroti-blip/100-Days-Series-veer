import java.util.Arrays;

public class BubbleSort2 {

    public static void bubbleSort(int arr[]){
        for(int i =0; i<arr.length; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] >arr[j+1]){
                    arr[j] = arr[j] + arr[j+1];
                    arr[j+1] = arr[j] - arr[j+1];
                    arr[j] = arr[j] - arr[j+1];
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    


    public static void main(String[] args) {
        
        int arr[] = {2,4,5,3,1};
        System.out.println("Array before sorting");
        System.out.println(Arrays.toString(arr));
        System.out.println("Array after sorting");
       bubbleSort(arr);
    }
}
