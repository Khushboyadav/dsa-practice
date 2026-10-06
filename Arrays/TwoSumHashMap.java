import java.util.HashMap;

public class TwoSumHashMap {
    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int target = 9;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) 
            {
            int need = target - arr[i];
            if (map.containsKey(need)) 
            {
                System.out.println(arr[i] + " + " + need + " = " + target);
                return;
            }

            map.put(arr[i], i);
        }
    }

}
