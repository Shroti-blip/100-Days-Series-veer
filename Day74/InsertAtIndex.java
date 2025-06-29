// package Day74;

  class InsertAtIndex {

    public static int insert(int arr[] , int digit){
        int low = 0;
        int high = arr.length-1;
        int mid =  low + (high-low)/2;
         if(digit>=arr[high]){
            return high+1;
        }
        while(low<=high){
            if(arr[mid]==digit){
               return mid;
            }
            if(arr[mid]<digit){
                low = mid+1;
            }
          else{
                high = mid-1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,8,44};
        int digit = 22;
        int res = insert(arr , digit);
        System.out.println("Index is : " + res);
    }
}