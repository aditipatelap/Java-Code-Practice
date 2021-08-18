import java.util.*;

public class split_string{

    public static void main(String[]args){
    String str = "Hii, I am Aditi Patel. I am an engineering Student. I Studing in VGEC College";
    String[] parts = str.split(" ");
    for (int i = 0; i < parts.length; i++) {
        System.out.println(parts[i]);
    }
    
    }
}
