public class FindMaxNumber {
    public static void main(String args[])
    {
        int[] arr={4,6,2,9,4,1,8};
        System.out.println(maximum(arr));
    }

    static int maximum(int[] arr)
    {
        int max=arr[0];
        if(arr.length==0)
        {
            return -1;
        }
        else
        {
          for(int i=1; i<arr.length; i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }  
        }
        return max;
        
    }
}
