import java.util.*;

class SearchElementInArray {
    public static void main(String args[]) {
        // Array search Program without the help of function()

        /*
         * int flag=0;
         * Scanner sc=new Scanner(System.in);
         * int[] arr=new int[50];
         * System.out.println("Enter the no of element in the array : ");
         * int n=sc.nextInt();
         * System.out.println("Enter element of the array : ");
         * for(int i=0;i<n; i++)
         * {
         * arr[i]=sc.nextInt();
         * }
         * System.out.println("Enter element to be searched in the array : ");
         * int item=sc.nextInt();
         * int i=0;
         * for(i=0;i<n; i++)
         * {
         * if(arr[i]==item)
         * {
         * flag=1;
         * break;
         * }
         * }
         * if(flag==1)
         * {
         * System.out.println(item+" Element found at "+ i+1 +" place.");
         * }
         * else
         * {
         * System.out.println(" Element NOT found at ");
         * }
         */

        // Program throgh making function

        // Return index where element found
        // return -1
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of element in the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter element of the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element to be searched in the array : ");
        int item = sc.nextInt();
        int found = Linearsearch(arr, item);
        if (found != -1) {
            System.out.println(item + " Element found at " + (found + 1) + "th place.");
        } 
        else {
            System.out.println(" Element NOT found at ");
        }
    }

    static int Linearsearch(int arr[], int item) {
        if (arr.length == 0) {
            return -1;
        } 
        else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == item) {
                    return i;
                }
            }
            return -1;
        }
    }
}