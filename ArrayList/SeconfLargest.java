package ArrayList;
import java.util.*;
public class SeconfLargest {
    public static void main(String[] args)
    {
        ArrayList<Integer> list= new ArrayList<>(Arrays.asList(11,42,3,14,5,60,7));
        // using simple logic
        int large= Integer.MIN_VALUE;
        int seclarg= Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++)
        {
            int curr=list.get(i);
            if(curr>large)
            {
                seclarg=large;
                large=curr;
            }
            else if(curr>seclarg && seclarg!=large)
            {
                seclarg=curr;
            }
        }
        System.out.println(seclarg);

        //Direct function

        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Second largest Element : "+ list.get(1));
   
    }
}
