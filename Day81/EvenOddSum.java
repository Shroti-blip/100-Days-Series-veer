public class EvenOddSum {


    static void sum(int[] arr){
        int oddSum =0;
        int evenSum =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] %2 ==0){
                evenSum += arr[i];
                  }
            else{
                 oddSum += arr[i];
            }
        }
        
       System.out.println("Sum of even digits are : "+evenSum);
          
       System.out.println("Sum of odd digits are : " + oddSum);
          
       
    }


    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8};
        sum(arr);
   
    }
}