// package Day77;

public class ContainDuplicate {
    
    static boolean duplicate(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i]; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i] == arr[i+1]){
                return true;
                // System.out.println("Exist" + i);
            }
        }
        return false;
    }


    public static void main(String[] args) {

        int[] arr = {1,2,2,3,4,5,6,6};
        System.out.println(duplicate(arr));
    }
}
