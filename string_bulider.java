import java.util.*;

public class string_bulider{

    public static void main(String[]args){

    StringBuilder sb = new StringBuilder("Hello Java");
    System.out.println(sb);

    //get any idex
    char ch = sb.charAt(2);
    System.out.println(ch);

    //update string
    sb.setCharAt(0,'B');
    System.out.println(sb);

    //inssert
    sb.insert(2,'H');
    System.out.println(sb);

    //delet charater
    sb.deleteCharAt(2);
    System.out.println(sb);

    //add charater
    sb.append("!!");
    System.out.println(sb);

    System.out.println(sb.length());

    //delet substring
    sb.delete(5, 12);
    System.out.println(sb);
    System.out.println(sb.length());

    }
}
