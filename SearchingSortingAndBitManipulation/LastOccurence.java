package SearchingSortingAndBitManipulation;

public class LastOccurence {
    public static void main(String[] args) {
        int ans = -1;
        int[] arr = {1, 1, 1, 2, 3, 4, 4, 5, 6, 6, 6, 6};
        int target = 4;
        for (int i = arr.length - 1; i >= 0; i--) {
            if(target == arr[i]) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
