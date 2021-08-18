import java.util.*;

public class add_string{

    public static void main(String[]args){
    String s1 = "Hello";
    String s2 = "world";
    String s3 = s1 + " " + s2;
    System.out.println(s3);
    String s4 = "Java";
    s4 += ' ';
    s4 += 'c';
    s4 += 'o';
    s4 += 'd';
    s4 += 'e';
    s4 += '2';
    s4 += '0';
    s4 += '2';
    s4 += '1';
    System.out.println(s4);
    System.out.println("Coder" + 10 + 20);//print Coder1020
    System.out.println(10 + 20 + "Coder");//print 30Coder
    //Bcz of code is eveluate form right to left

    }
}
