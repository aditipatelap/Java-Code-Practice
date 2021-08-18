import java.util.*;

public class string_inp{

    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    String s1 = input.next();
    String s2 = input.next();
    input.nextLine();// for remove new line chaeater after s2 string.
    String s3 = input.nextLine();
    /* input:
    abcd efgh
    hello java
    */
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    /* output:
    abcd <-- s1
    efgh <-- s2
    hello java <-- s3
    */

    }   
}
