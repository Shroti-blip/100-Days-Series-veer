public class fibonachhi_java {

    public static void main(String[] args)
    {
        int firstNum = 0;
        int secondNum = 1;
        int n = 10;
        for(int i = 0; i<n; i++){
          int sum =   firstNum+secondNum;
          firstNum = secondNum;
          secondNum = sum;
          System.out.println(sum);
        }
    }
}