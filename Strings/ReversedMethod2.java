package Strings;

public class ReversedMethod2 {
    public static void main(String[] args) 
    {
        String str = "khushboo";
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--)
        {
            reversed += str.charAt(i);
        }

        System.out.println(reversed);
    }
}

