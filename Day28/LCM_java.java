// package Day28;

public class LCM_java {
    
    public static int getGCD(int a , int b){
        if( b == 0){
            return a;
        }
        return getGCD(b, a %b);
    }
    public static int getLCM(int a , int b){
        return (a*b)/ getGCD(a , b);
    }


    public static void main(String[] args) {
        int a = 10 ; 
        int b =22;
        int store = getLCM(a , b);
        System.out.println(store);
    }

}
