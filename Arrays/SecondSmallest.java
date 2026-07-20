//Second Smallest element in the Array
public class SecondSmallest {
    public static void main(String[] args) {
        int[] arr = { 5, 3,243, 9, 32, 2, 76, 4, 99 };
        int min2=arr[0];
        int min1=arr[1];
        for(int i=2; i<arr.length; i++)
        {
            if(arr[i]<min1)
            {
                min2=min1;
                min1=arr[i];
            }
            else if(arr[i]<min2)
            {
                min2=arr[i];
            }
        }
        System.out.println("Second Smallest Element = "+min2);
    }
}
