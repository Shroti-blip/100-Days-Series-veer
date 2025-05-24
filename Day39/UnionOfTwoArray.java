class UnionOfTwoArray{

    public static void main(String[] args) {
        
        int[] arr1= {1,2,3,4,5};
        int[] arr2 = {4,5,6,7,8,9};

        int[] uniArray = new int [arr1.length + arr2.length];
        int k=0;

        for(int i=0; i<arr1.length; i++){
            uniArray[k++] =arr1[i];
        }

        for(int j=0; j<arr2.length; j++){
            boolean ispresent = false;
            for(int l =0; l<k; l++){
                if(arr2[j] == uniArray[l]){
                    ispresent = true;
                    break;
                }
            }
            if(!(ispresent)){
                uniArray[k++] =arr2[j];
            }
        }

        System.out.println("Union of Array is: ");

        for(int i=0;i<k;i++){
            System.out.print(uniArray[i] +",");
        }

        // 

//         for (int num : uniArray) {
//     System.out.print(num + ",");
//          }

       
    }
}