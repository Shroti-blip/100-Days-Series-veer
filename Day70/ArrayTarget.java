class ArrayTarget{

    public static void arrayTarget( int arr[], int t){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++ ){
                if(arr[i] + arr[j] == t){
                    System.out.println( "Indices : " +i + ","+ j);
                    // return;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7} ;
        int target = 9;
        arrayTarget( arr , target);
    }
}
