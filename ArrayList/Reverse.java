package ArrayList;
import java.util.*;
public class Reverse {
    public static void main(String[] args)
    {
        ArrayList<Integer> list= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        //Reverse through normal method
        int len=list.size()-1;
        for(int i=0; i<len/2; i++)
        {
            int temp=list.get(i);
            list.set(i, list.get(len-i));
            list.set(len-i, temp);
        }
        //Reverse the ArrayList usenig Collections
        //Collections.reverse(list);
        System.out.println(list);
    }
    
}
