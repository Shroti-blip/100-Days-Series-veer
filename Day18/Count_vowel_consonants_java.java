// package Day18;

public class Count_vowel_consonants_java {
    

    public static int getVowel(String str){
        int count =0;
        for(int i =0;i<str.length(); i++){

            if(str.charAt(i)=='a' || str.charAt(i) =='e' || str.charAt(i) =='i' || str.charAt(i) =='o' || str.charAt(i)=='u'){
                count++;
            }
        }
       return count;

    }

    //count consonants;

    public static int getConso(String str){
        int count =0;
        for(int i=0; i<str.length(); i++ ){
            if(!(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i) =='i' ||str.charAt(i) =='o' || str.charAt(i) =='u')){
                count++;
            }
        }
        return count;
    }
   

    public static void main(String[] args) {
        String str = "hello world";
        System.out.println("Number of vowels are : "+getVowel(str));
        System.out.println("Number of Consonants in this one is : "+getConso(str));
    }
}
