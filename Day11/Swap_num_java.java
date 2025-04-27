// package Day11;

public class Swap_num_java {

    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        System.out.println("Before swapping number value of a and b are: " + a + " , "+ b);
      
        a = a + b;
        b = a-b;
        a = a-b;
       System.out.println("Swapped numbers are : "+  a + " , " + b);
    }
}
