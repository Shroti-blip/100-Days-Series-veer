class SecondLargestNum {

    static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i +",");
        }
    }

    static void findsecondlargest(int[] arr){
        // sort(arr);
        int l = arr.length;
        System.out.println("second largest num is : "+arr[l-2]);
    }
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 3, 88, 65 };
        sort(arr);
        System.out.println("====================");
        findsecondlargest(arr);
    }
}