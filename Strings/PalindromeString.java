package Strings;

public class PalindromeString {
    public static void main(String[] args) {
        String str="madam";
        String rev= new StringBuilder(str).reverse().toString();
        if(str.equals(rev))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");

        }
    }
}
