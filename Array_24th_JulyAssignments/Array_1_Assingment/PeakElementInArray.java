package Array_24th_JulyAssignments.Array_1_Assingment;

public class PeakElementInArray {
    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 3, 2, 6, 5};
        int ans = peakElement(arr);
        System.out.println(ans);
    }

    private static int peakElement(int[] arr) {
        int ans = 0;
        for (int i = 1; i < arr.length - 1; i++) {

            if (arr[i] > arr[i-1] && arr[i] > arr[i+1]) {
                return ans = arr[i];
            }
        }
        return ans;
    }
}
