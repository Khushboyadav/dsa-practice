package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SecondSmallest {
    public static void main(String[] args)
    {
        ArrayList<Integer> list= new ArrayList<>(Arrays.asList(11,42,3,14,5,60,7));
        int small=Integer.MAX_VALUE;
        int secsmal=Integer.MAX_VALUE;
        for(int i=0; i<list.size(); i++)
        {
            int curr=list.get(i);
            if(curr<small)
            {
                secsmal=small;
                small=curr;
            }
            else if(curr<secsmal && secsmal!=small)
            {
                secsmal= curr;
            }
        }
        System.out.println(secsmal);

        //Direct using function
        Collections.sort(list);
        System.out.println("Second largest Element : "+ list.get(1));
   
    }
    
    
}
