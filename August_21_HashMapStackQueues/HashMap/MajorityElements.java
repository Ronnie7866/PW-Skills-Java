package August_21_HashMapStackQueues.HashMap;

import java.util.HashMap;

public class MajorityElements {
    private static int majority(int[] arr) {
        int vote = 1;
        int currCandidate = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == currCandidate) vote++;
            else if (vote == 0) {
                currCandidate = arr[i];
                vote++;
            }
            else vote--;
        }
        return currCandidate;
    }

    private static int majorityII(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else map.put(arr[i], map.get(arr[i]) + 1);
        }
        int mostFrequentKey = -1;
        int maxFrequency = 0;

        // Find the key with the maximum frequency
        for (var entry : map.entrySet()) {
            int currentFrequency = entry.getValue();
            if (currentFrequency > maxFrequency) {
                maxFrequency = currentFrequency;
                mostFrequentKey = entry.getKey();
            }
        }
        return mostFrequentKey;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 4, 7, 8, 8, 6, 6, 4, 2, 2, 2, 2, 2};
        int ans = majorityII(arr);
        System.out.println(ans);
    }
}
