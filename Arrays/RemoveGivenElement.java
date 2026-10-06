import java.util.Arrays;

public class RemoveGivenElement {
    public static void main(String[] args) {
        int[] num = { 3, 2, 1, 5, 2, 6 ,2};
        int target = 2;

        int j = 0; // position for non-target elements

        for (int i = 0; i < num.length; i++) {

            if (num[i] != target) {
                num[j] = num[i];
                j++;
            }
        }

        // Print elements after removing target
        for (int i = 0; i < j; i++) {
            System.out.print(num[i] + " ");
        }
    }

}
