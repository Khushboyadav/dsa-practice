package ArrayList;
import java.util.ArrayList;
public class CreatingArrayLIst {
    public static void main(String [] args)
    {
        //Integer ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //String ArrayList
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("is");
        list1.add("a");
        list1.add("list");
        list1.add("String Arraylist");
        list1.add(0, "This");
        list1.add(4, "of");

        //Boolean ArrayList
        ArrayList<Boolean> list2 = new ArrayList<>();
        list2.add(true);
        list2.add(false);

        //Printing
        System.out.println(list);
        System.out.println(list1);
        System.out.println(list2);

    }
    
}
