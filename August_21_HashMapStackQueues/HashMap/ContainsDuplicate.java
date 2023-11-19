package August_21_HashMapStackQueues.HashMap;

import java.util.HashMap;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            }
            else {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 3};
        boolean ans = containsDuplicate(arr);
        System.out.println(ans);
    }
}
