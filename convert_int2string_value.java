import java.util.*;

public class convert_int2string_value{

    public static void main(String[]args){
        // 1. Converting int value to String value
         
        int intParam = 2003;
         
        String strValue1 = String.valueOf(intParam);
         
        String strValue2 = Integer.toString(intParam);
         
         
         
        // 2. Converting Integer object to String value
         
        Integer year = new Integer(2021);
         
        String strValue3 = String.valueOf(year);
         
        String strValue4 = year.toString();
         
        //Verify results
        System.out.println(strValue1);
        System.out.println(strValue2);
        System.out.println(strValue3);
        System.out.println(strValue4);
    }
}
