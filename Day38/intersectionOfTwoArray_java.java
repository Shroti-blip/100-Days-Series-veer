// package 100_Days_Series.Day38;

public class intersectionOfTwoArray_java {
    

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {3,4,5,6,7};
        // int store ;

        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    //store intersection
                   System.out.println(arr1[i]+" ");
                   break;
                }
            }
        }

        // System.out.println(store+" ");
    }
}
