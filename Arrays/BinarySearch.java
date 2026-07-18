public class BinarySearch {
    public static void main(String args[]) 
    {
        int[] arr = { 2, 4, 5, 32, 56, 76, 89, 99, 234 };
        int item = 89;
        int ans=binarysearch(arr, item);
        System.out.println("Index of Search Element "+ans);
    }

    static int binarysearch(int[] arr, int item) 
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

}
