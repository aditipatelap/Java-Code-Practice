import java.util.*;
import java.io.*;

public class convert_string2int_value{

    public static void main(String[]args){
    String str = new String();
    str = "200100";
    int val1 = Integer.valueOf(str);
    int val2 = Integer.parseInt(str);
    System.out.println(val1);
    System.out.println(val2);

    }
}
