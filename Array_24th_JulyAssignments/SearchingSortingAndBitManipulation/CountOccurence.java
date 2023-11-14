package Array_24th_JulyAssignments.SearchingSortingAndBitManipulation;

public class CountOccurence {
    public static void main(String[] args) {
        int[] arr = {2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
        int target = 5;
        int ans = OccureceCount(arr, target);
        System.out.println("Target " + target + " occurs " + ans + " times");
    }

    private static int OccureceCount(int[] arr, int target) {
        int cnt = 0;
        for (var i : arr) {
            if (i == target) {
                cnt++;
            }
        }
        return cnt;
    }
}
