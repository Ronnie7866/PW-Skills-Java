package Array_24th_JulyAssignments.Array_1_Assingment;

public class MaximumElementInArray {
    public static void main(String[] args) {
        int[] arr = {34, 21, 54, 65, 43};
        int ans = maximumElement(arr);
        System.out.println(ans);
    }

    private static int maximumElement(int[] arr) {
        int maxEle = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxEle) {
                maxEle = arr[i];
            }
        }
        return maxEle;
    }
}
