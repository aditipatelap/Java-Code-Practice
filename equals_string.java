import java.util.*;

public class equals_string{

    public static void main(String[]args){
    String s1 = "Hello";
    String s2 = "Hello";
    //s1 and s2 has same add. bcz it is has in same shell
    //It's called interning and in memeory location is called internpool.
    String s3 = new String("Hello");
    //Now s1,s2 and s3 point same charater arry but s3 have a new shell.
    // Function of == <-- It's check only add.
    // Function of equals <-- first check add if it is same , return true if is false then
    // check string charater by charater.
    boolean flag;
    flag = (s1 == s2);
    System.out.println("s1 == s2 --> " + flag);
    flag = (s1 == s3);
    System.out.println("s1 == s3 --> " + flag);
    flag = (s1.equals(s2));
    System.out.println("s1.equals(s2) --> " + flag);
    flag = (s1.equals(s3));
    System.out.println("s1.equals(s3) --> " + flag);

    }
}
