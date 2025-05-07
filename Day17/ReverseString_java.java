// package Day17;

import javax.sql.rowset.spi.SyncResolver;

public class ReverseString_java {

    public static void main(String[] args) {
        String str = "Hello";
        String store = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            store += str.charAt(i);
        }
        System.out.println(str);
        System.out.println(store);

    }

}
