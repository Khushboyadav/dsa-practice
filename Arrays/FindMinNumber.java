public class FindMinNumber {
    public static void main(String args[])
    {
        int[] arr={4,6,2,9,4,1,8};
        System.out.println(minimum(arr));
    }

    static int minimum(int[] arr)
    {
        int min=arr[0];
        if(arr.length==0)
        {
            return -1;
        }
        else
        {
          for(int i=1; i<arr.length; i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }  
        }
        return min;
        
    } 
    
}
