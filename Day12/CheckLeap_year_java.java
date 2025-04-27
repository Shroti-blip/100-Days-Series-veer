// package Day12;

public class CheckLeap_year_java {
    public static boolean checkLeap(int year){
        if((year %4 == 0 && year%100 !=0) || year %400 ==0){
            return true;
        }
        else{
            return false;
        }
    }


    public static void main(String[] args) {
        boolean res = checkLeap(2000);
        if(res == true){
            System.out.println("Given year is a Leap year");
        }
        else{
            System.out.println("Not a Leap year");
        }
    }
}
