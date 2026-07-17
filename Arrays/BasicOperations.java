import java.util.*;
public class BasicOperations {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No. of elements: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter Elements: ");
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(" Element Traversal : ");
        Traverse(arr,n);
        System.out.println("Enter Elements to be inserted : ");
        int value=sc.nextInt();
        System.out.println(" New Array : ");
        Insertion(arr,value);
        Traverse(arr,n);
        System.out.println("Enter Position to be Deleted : ");
        int pos=sc.nextInt();
        Deletion(arr,pos);
        Traverse(arr,n);

        
    }

    //Traverse the element of Array
    static void Traverse(int arr[],int len)
    {
        for(int i=0; i<len; i++)
        {
            System.out.println(arr[i]+" at "+(i+1)+"th position.");
        }
    }

    //Insertion in a Array
    static void Insertion(int arr[],int value)
    {
        arr[arr.length-1]=value;
    }

    //Deletion
    static void Deletion(int arr[],int index)
    {
        arr[index-1]=0;
    }
    
}
