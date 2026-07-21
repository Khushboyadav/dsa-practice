//Smallest number which is greater than the target
public class CellinfSmallest {
    public static void main(String[] args) {
        char[] arr = { 'c','f','j'};
        char item = 'c';
        char ans=binarysearch(arr, item);
        System.out.println("Ceilinh Element "+ans);
    }

    static char binarysearch(char[] arr, char item) 
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
                return arr[mid];
            }
        }
        return arr[start% arr.length];
    }
}
