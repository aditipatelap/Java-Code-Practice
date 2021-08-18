import java.util.*;

public class arrylist{

    public static void main(String[]args){
    ArrayList<Integer> list = new ArrayList<>();

    //for size
    System.out.println(list.size());

    //add
    list.add(10);
    list.add(20);
    list.add(30);
    list.add(40);
    System.out.println(list + " --> " + list.size());

    //add at any place
    list.add(1, 15);
    System.out.println(list + " --> " + list.size());
    
    //get any palce value
    int val = list.get(2); // not list[1]; <-- it is not woeking,
    System.out.println(val);

    //set or change the value at any place
    list.set(1, 18); // not list[1] = 18; <-- it is not woeking,
    System.out.println(list + " --> " + list.size());

    //remove
    list.remove(1); // not list[1] = 18;<-- it is not woeking,
    System.out.println(list + " --> " + list.size());

    //we also make array list as a String,
    ArrayList<String> str_list = new ArrayList<>();
    str_list.add("Hello");
    str_list.add("Bello");
    str_list.add("Cello");
    System.out.println(str_list + " --> " + str_list.size());

    //for printing
    //Method : 1
    for (int i = 0; i < list.size(); i++) {
        int var = list.get(i);
        System.out.println(var);
    }

    //Method : 2
    for(int var: list)
    System.out.println(var);

    //Method : 3
    System.out.println(list);

    }
}
