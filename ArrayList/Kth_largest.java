package ArrayList;
import java.util.*;

public class Kth_largest {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(
            Arrays.asList(10, 40, 20, 50, 30)
        );

        int k = 3;

        Collections.sort(list, Collections.reverseOrder());

        if (k >= 1 && k <= list.size()) {
            System.out.println(k + "th Largest Element: " + list.get(k - 1));
        } else {
            System.out.println("Invalid K");
        }
    }
}
