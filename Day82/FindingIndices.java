
public class FindingIndices {

    public static int findIdx(int[] arr , int target , int index){
        int count =0;
        if(index == arr.length){
            return 0;
        }
        if(arr[index] == target){
           System.out.println("index are: " + index);
        }
        return findIdx(arr, target, ++index);
    }
    public static void main(String[] args){
        int[] arr= {1,2,3,4,5,6,6,7,7};
        int target=6;
        int index =0;

        int idx = findIdx(arr , target , index);
    }
}