import java.util.Arrays;

class QuickSort_java{

    static void quicksort(int[] arr , int low , int hi){
        if(low>=hi){
            return;
        }

        int s = low;
        int e = hi;
        int m = s + (e-s)/2;
        int pivot = arr[m];

        while(s<=e){
            while(arr[s] < pivot){
                s++;
            }

            while(arr[e] > pivot){
                e--;
            }
        if( s <= e){//violation like check pivot rhs and lhs values for it.
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        }

        quicksort(arr , low ,e);//low is idx 0 and e is the pointer that was decreasing and came to pivot left side 
        quicksort(arr, s,hi);//hi is idx arr.length and s is pointer that was increasing and came to pivot right side. 
    }

    public static void main(String[] args) {
        int arr[] = {3,2,5,4,1};
        quicksort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}