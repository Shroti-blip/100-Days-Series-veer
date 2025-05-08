public class RemoveDuplicate_java {

    public static int[] getRemoveDuplicate(int[] arr) {
        int size = arr.length;
        int[] temp = new int[size];
        int index = 0;

        for (int i = 0; i < size; i++) {
            int j;
            for (j = 0; j < index; j++) {
                if (arr[i] == temp[j]) {
                    break;
                }
            }
            // Only add if not found in temp
            if (j == index) {
                temp[index++] = arr[i];
            }
        }

        // Create a result array of correct size
        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = s.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        int[] carr = getRemoveDuplicate(arr);

        System.out.println("Array after removing duplicate elements: ");
        for (int num : carr) {
            System.out.print(num + " ");
        }
    }
}
