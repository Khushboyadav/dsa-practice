//Element given in sorted order but you don't know whether it's in assending or decending order
// we need to perform binary search on this Array
public class OederAgnosticBS {
    public static void main(String args[]) 
    {
        int[] arr = { 34,34,28,22,19,9,6,3};
        int item = 19;
        int ans;
        if(arr[0]<arr[arr.length-1])
        {
            ans=AssendingABS(arr, item);
        }
        else if(arr[0]>arr[arr.length-1])
        {
            ans=DessendingABS(arr, item);
        }
        else
        {
            System.out.println("All element are equals");
            ans=-1;
        }
        

        System.out.println("Index of Search Element "+ans);
    }

    static int AssendingABS(int[] arr, int item) 
    {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) 
        {
            int mid = start + (end - start) / 2;
            if (item < arr[mid]) 
            {
                end = mid - 1;
            } 
            else if (item > arr[mid]) 
            {
                start = mid + 1;
            } 
            else 
            {
                return mid;
            }
        }
        return -1;
    }
    static int DessendingABS(int[] arr, int item) 
    {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) 
        {
            int mid = start + (end - start) / 2;
            if (item > arr[mid]) 
            {
                end = mid - 1;
            } 
            else if (item < arr[mid]) 
            {
                start = mid + 1;
            } 
            else 
            {
                return mid;
            }
        }
        return -1;
    }
}
