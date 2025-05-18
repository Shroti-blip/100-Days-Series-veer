import java.util.Arrays;

public class BubbleSort {
    
public static void bubbleSort(int[] arr){

    for(int i=0; i<arr.length; i++){
        for(int j=0 ; j<arr.length-1; j++){
            if(arr[j] > arr[j+1]){
                //swapping
                int temp = arr[j+1];
                 arr[j+1] = arr[j];
                 arr[j] = temp;
            }
        }
    }
    // System.out.println(Arrays.toString(arr));

    for(int i: arr){
        System.out.println(arr[i-1]);
    }
}
 
    public static void main(String [] args){
        int [] arr={3,1,5,2,4};
        bubbleSort(arr);
        
    }
}
