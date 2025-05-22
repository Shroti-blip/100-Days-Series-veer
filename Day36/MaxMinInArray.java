class MaxMinInArray{


    public static void main(String[] args) {
        int[] arr ={3,4,20,45,1,88};

        int max = arr[0];
        int min = arr[0];

        // System.out.println(max);
        // System.out.println(min);

        for(int i =0; i<arr.length; i++){
            //for max
            if(arr[i] > max){
                max = arr[i];
            }

            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Maximum number is : " + max);
         System.out.println("Minimum number is : " + min);
  
    }
}