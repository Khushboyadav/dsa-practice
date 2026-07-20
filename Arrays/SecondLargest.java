public class SecondLargest {
    public static void main(String[] args)
    {
        int[] arr = { 2, 4,243, 5, 32, 6, 76, 189, 99 };
        int max2=arr[0];
        int max1=arr[1];
        for(int i=2; i<arr.length; i++)
        {
            if(arr[i]>max1)
            {
                max2=max1;
                max1=arr[i];
            }
            else if(arr[i]>max2)
            {
                max2=arr[i];
            }
        }
        System.out.println("Second largest Element = "+max2);
    }
}
