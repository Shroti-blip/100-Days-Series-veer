// package Day9;

public class Count_digit_java {
    

    public static int getCount(int num){
        if(num<0){
            num = -num;
        }
         int count = 0;
        while(num != 0){
            count++;
            num /= 10;
            
        }
        return count;
    }

    public static void main(String[] args) {
       int  num = 1232323;
        int c = getCount(num);
        System.out.println(c);
    }
}
