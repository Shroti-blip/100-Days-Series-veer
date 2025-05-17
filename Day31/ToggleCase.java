// package Day31;

public class ToggleCase {

    public static String getToggle(String str){
        StringBuilder result = new StringBuilder();

        for(char ch : str.toCharArray()){
             if(Character.isLowerCase(ch)){
            result.append(Character.toUpperCase(ch));
        }
        else if(Character.isUpperCase(ch)){
            result.append(Character.toLowerCase(ch));
        }
        else{
            result.append(ch);
        }
        }
       return result.toString();
    }

    public static void main(String[] args) {
        String str = "holAa";
        String store = getToggle(str);
        System.out.println("Answer is : " + store);
        
    }
}
