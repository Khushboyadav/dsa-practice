//How many number contain even number of Digits
public class EvenNumOfDigit {
    public static void main(String args[])
    {
        int arr[]={21,34,789,378,1928,0};
        System.out.println(Digits(arr));
    }

    //Calculating how many even number are present in the array
    static int Digits(int[] arr)
    {
        int count=0;
        for(int i=0; i<arr.length; i++)
        {
            //if(even(arr[i]))
            if(method2(arr[i])%2==0)
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
        if(num<0)
            num=num* -1;
        if(num==0)
            return false;
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


    //Shortcut to find the number of digits
    //System.out.println((int)Math.log10(num)+1);

    //Method 2 to find number of digits
    static int method2(int num)
    {
        return (int)Math.log10(num)+1;
    }
}
