import java.util.*;

public class intput_int_nd_string{

    public static void main(String[]args)
    {
        Scanner scn = new Scanner(System.in);
        int n = Integer.parseInt(scn.nextLine());
        String name = scn.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
        System.out.println(name);
    }
}
