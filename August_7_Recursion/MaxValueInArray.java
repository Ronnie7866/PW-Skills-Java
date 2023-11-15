package August_7_Recursion;

public class MaxValueInArray {
    private static int maxElement(int[] arr, int idx, int ans) {
        if (idx == arr.length-1) {
            return Math.max(arr[idx], ans);
        }
        ans = Math.max(ans, arr[idx]);
        return maxElement(arr, idx + 1, ans);
    }
    public static void main(String[] args) {
        int[] arr = {13, 1, -3, 22, 5};
        int ans = maxElement(arr, 0, Integer.MIN_VALUE);
        System.out.println(ans);
    }
}
