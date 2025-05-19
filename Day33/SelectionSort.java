// package Day33;

import java.util.Arrays;

public class SelectionSort {
    
    public static void selectionSort(int arr[]){
        for(int i=0; i<arr.length; i++){
            int miniidx = i;
            for(int j =0; j<arr.length-1; j++){
                //find minimam
                if(arr[j] > arr[miniidx]){
              miniidx = j;
                }
                //swap
                int temp = arr[miniidx];
                arr[miniidx] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {
        int arr[] = {2,3,4,5,1};
        System.out.println("Before Sorting");
        System.out.println(Arrays.toString(arr));
        System.out.println("After Sorting");
       selectionSort(arr);
        // System.out.println(selectionSort(arr));
    }
}
