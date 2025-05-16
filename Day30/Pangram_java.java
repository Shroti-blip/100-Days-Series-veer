// package Day30;

import java.util.HashSet;
import java.util.Set;

public class Pangram_java {
    
    public static boolean isPangram(String sentence){

        sentence = sentence.toLowerCase();

        
    // Create a Set to store unique letters
       Set<Character> uinqueletters = new HashSet<>();

         // Iterate through each character
         for(char ch: sentence.toCharArray()){
            if(ch>='a' && ch<='z'){
                uinqueletters.add(ch);
            }
         }
         return uinqueletters.size() == 26;
    }


    public static void main(String[] args) {
        System.out.println(isPangram("The quick brown fox jumps over the lazy dog"));
        System.out.println(isPangram("Hello world"));
    }
}
