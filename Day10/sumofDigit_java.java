class sumofDigit_java{

    public static int sumof_Digit( int num){
        // int count =0;
        int sum = 0;
        while(num !=0){
            sum = sum +num % 10;
            num /= 10;
            // count++;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num = 123456;
        int store = sumof_Digit(num);
        System.out.println(store);
    }
}