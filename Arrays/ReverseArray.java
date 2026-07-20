public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int left=0,temp;
        int right=arr.length-1;
        System.out.println("Original Array : ");
        for(int i=0; i<arr.length ;i++)
        {
            System.out.print(arr[i]+" ");
        }
        for(int i=0; i<arr.length/2 ;i++)
        {
            temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left+=1;
            right-=1;
        }

        System.out.println("\nReversed Array : ");
        for(int i=0; i<arr.length ;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
