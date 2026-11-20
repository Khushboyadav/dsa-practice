package ArrayList;
import java.util.*;
public class Largest {
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
        int large= Integer.MIN_VALUE;
        int curr;
        for(int i=0; i<n; i++)
        {
            curr=list.get(i);
            if(curr>large)
            {
                large=curr;
            }
        }
        System.out.println("Largest element :"+large);

        //Direct method
        Collections.sort(list);
        System.out.println(list.get(n-1));
    }
    
}
