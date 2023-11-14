package Array_24th_JulyAssignments.SearchingSortingAndBitManipulation;

public class TotalNumberOfOnes {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,1,1,1,1,1,1,1};
        int index = countOnes(arr);
        int ans = arr.length - index;
        System.out.println(ans);
    }

    private static int countOnes(int[] arr) {
        int idx = -1;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == 1) {
                idx = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return idx;
    }
}
