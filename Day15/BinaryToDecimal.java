class BinaryToDecimal{
    
    public static int BintoDec(int num){
        int decimal=0;
        int base=1;
        while(num!=0){
            int remainder = num %10;
            decimal += remainder * base;
            base = base *2;
             num /=10;
        }
        return decimal;
    }

 public static void main(String[] args){
//   int num=1011;
//   int store = BintoDec(num);
//   System.out.println(store);

  java.util.Scanner s = new java.util.Scanner(System.in);
  System.out.println("Enter a Binary Number: ");
  int num = s.nextInt();

  int store = BintoDec(num);
  System.out.println("Decimal value of this number is : "+store);


 }
}