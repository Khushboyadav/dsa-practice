public class CeilingNumber {
    public static void main(String args[]) 
    {
        int[] arr = { 2,3,5,9,14,16,18 };
        int item = 4;
        int ans=binarysearch(arr, item);
        System.out.println("Ceilinh Element "+arr[ans]);
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
        return start;
    }
}
