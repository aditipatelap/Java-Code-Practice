import java.lang.invoke.StringConcatFactory;
import java.util.*;

public class substring{

    public static void main(String[]args){
    //substring
    String s = "abcdefgh igklmn";
    System.out.println(s.substring(0));
    System.out.println(s.substring(3));
    System.out.println(s.substring(0,4));
    System.out.println(s.substring(4,4));//blank
    //System.out.pritln(s.substring(5,0));  <-- It's throw error.
    System.out.println(s.substring(4,11));
    //print substring
    String str = "Hello";
    for (int i = 0; i < str.length(); i++) {
        for (int j = i+1; j <= str.length(); j++) {
            System.out.println("i = " + i + ", j = " + j + "  -->" + str.substring(i,j));
        }
    }

    }
}
