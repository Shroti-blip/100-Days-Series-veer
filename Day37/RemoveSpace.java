// package 100_Days_Series.Day37;

public class RemoveSpace {
    
    static String removespace(){
        String name = "Muskan Shroti";
        String store ="";
        for(int i =0; i<name.length(); i++){
           
            // store = name.append()
            char ch = name.charAt(i);
            if(ch != ' '){
              store += ch;
            }
        }
        return store;
    }


    static String removespace2(){
        String str ="Hola Amiga";
        String store = "";
        for(int i=0; i<str.length(); i++){
        
            char ch = str.charAt(i);
            if(ch == ' '){
                continue;
            }
            else{
                store += ch;
            }
        }
        return store;
    }
    public static void main(String[] args) {
        
        // String name = "Muskna Shroti";
      String result =  removespace();
      System.out.println(result);

       String result2 =  removespace2();
      System.out.println(result2);
      
    }
}
