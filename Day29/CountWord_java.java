// package Day29;

public class CountWord_java {
    
    public static int countWorld(String str){
        int count =1;
        for(int i =0; i<str.length(); i++ ){
            if(str.charAt(i) == ' '){
                count++;
            }
        }
        return count ;
    }


    public static void main(String[] args) {
        String str = "Hello World";
        int totalcount = countWorld(str);
        System.out.println("Total words are : " + totalcount );
    }
}
