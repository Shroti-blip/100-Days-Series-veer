// package Day83;

public class BinarySearch_java {
    
    static  int binary(int[] arr , int target){
        int start =0; 
        int end = arr.length-1;
     
      while(end>=start){

           int mid = start + (end-start)/2;
            if(arr[mid]==target){
              return mid;
            
            }
            if(arr[mid]<=target){
                start = mid+1;
            }
            else{
                end =mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7,8};
        int target = 3;
        int res = binary(arr, target);
        System.out.println(res);
        System.out.println("Hola");
    }



}
