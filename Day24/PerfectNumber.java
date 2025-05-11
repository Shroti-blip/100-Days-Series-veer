// package Day24;

public class PerfectNumber {
    
    public static boolean perfectNum(int num){
        int count = 0;
        if(num==0){
            return false;
        }
        for(int i =1 ; i<num; i++){
            if((num % i )==0){
                count = count + i;
            }
        }
        if(count == num){
            return true;
        }
      else{
        return false;
      }
    }

    public static void main(String[] args) {
        boolean result = perfectNum(496);
        System.out.println(result);
    }
}
