class MergingTwoArray{

public static int[] merge(int[] arr1 , int[] arr2 ){
    int n = arr1.length;
    int m = arr2.length;
    int[] merged = new int[n + m];

    for(int i=0; i<n; i++){
        merged[i] = arr1[i];
    }
    for(int i=0; i<m; i++){
        merged[n+i] = arr2[i];
    }
    return merged;
}

    public static void main(String[] args) {
       int arr1[]={1,3,5,7,9};
        int arr2[]={2,4,6,8,10};
       int result[] = merge(arr1, arr2);
   for (int num : result) {
    System.out.println(num);
}

       //  System.out.println(result);
    }
}