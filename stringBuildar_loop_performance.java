import java.util.*;

public class stringBuildar_loop_performance{

    public static void main(String[]args){
        int n = 100000;
        long start_time = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n ; i++) {
            sb.append(i);
        }
        long end_time = System.currentTimeMillis();
    
        System.out.println(end_time - start_time);

    }
}
