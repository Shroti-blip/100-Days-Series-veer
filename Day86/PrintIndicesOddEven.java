// package Day86;

public class PrintIndicesOddEven {
    
    static void indices(int[] arr){
        int isEven =0;
        int isOdd =0;
         for(int i=0; i<=arr.length-1; i++){
            if(arr[i] % 2==0){
                isEven++;
            }
            else{
                isOdd++;
            }
    }
    System.out.println("Sum of Even Indices : "+ isEven);
    System.out.println("Sum of Even Indices : "+ isOdd);
    }
   


    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7,9,10};
        indices(arr);
    }
}
