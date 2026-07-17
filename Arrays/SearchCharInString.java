import java.util.*;

public class SearchCharInString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = "Khushboo Program";
        System.out.println("Enter Character to be search in a String : ");
        char item = sc.next().charAt(0);
        System.out.println(search(str, item));

    }

    static String search(String str, char item) {
        int len = str.length();
        if (len == 0) {
            return "Please enter an string";
        } else {
            for (int i = 0; i < len; i++) {
                if (str.charAt(i) == item) {
                    return "Matched";

                }
            }
            return "Not Matched";
        }
    }

}
