//How many number contain even number of Digits
public class EvenNumOfDigit {
    public static void main(String args[])
    {
        int arr[]={21,34,789,378,1928,1};
        System.out.println(Digits(arr));
    }

    //Calculating how many even number are present in the array
    static int Digits(int[] arr)
    {
        int count=0;
        for(int i=0; i<arr.length; i++)
        {
            if(even(arr[i]))
            {
                count++;
            }
        }
        return count;
    }

    //Counting  digit in the number
    static boolean even(int num)
    {
        int count=0;
        while(num>0)
        {
            count++;
            num/=10;
        }
        if(count%2==0)
            return true;
        else
            return false;
    }
}
