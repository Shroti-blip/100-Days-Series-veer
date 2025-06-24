// package Day69;

public class MissingNumber {

    public static int missingNum(int[] arr) {

        // find sum of number
        int n = arr.length + 1;
        int sumN = n * (n + 1) / 2;
        System.out.println(sumN);
        // find sum of array
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("sum of array is: " + sum);

        return sumN - sum;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 6, 7, 8, 9 };
       int num = missingNum(arr);
       System.out.println("Missing Number is : "+num);
    }
}
