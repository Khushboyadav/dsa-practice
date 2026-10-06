public class RemoveDuplicates {
    //Remove Duplicates from a Sorted Array — Two-Pointer Approach
    public static void main(String[] args) {
        int[] num={1,1,2,2,2,3,4,5,5};
        int uq=0;
        for(int i=1; i<num.length; i++)
        {
            if(num[i]!=num[uq])
            {
                uq++;
                num[uq]=num[i];
            }
        }
        for (int i = 0; i <= uq; i++) 
        {
            System.out.print(num[i] + " ");
        }
    }
    
}
