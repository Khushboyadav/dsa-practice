package ArrayList;
import java.util.*;

public class Smallest {
    public static void main(String[] args)
    {
        ArrayList<Integer> list= new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No. of elements: ");
        int n=sc.nextInt();
        System.out.println("Enter the elements: ");
        for(int i=0; i<n;i++)
        {
            int element=sc.nextInt();
            list.add(element);
        }
        //simple logic
        int small= Integer.MAX_VALUE;
        int curr;
        for(int i=0; i<n; i++)
        {
            curr=list.get(i);
            if(curr<small)
            {
                small=curr;
            }
        }
        System.out.println("Smallest element :"+small);

        //Direct method
        Collections.sort(list);
        System.out.println(list.get(0));
    }
    
}
