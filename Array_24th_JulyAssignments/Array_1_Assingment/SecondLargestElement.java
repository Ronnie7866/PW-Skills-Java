package Array_24th_JulyAssignments.Array_1_Assingment;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {34, 21, 54, 65, 43};
        int ans = secondLargest(arr);
        System.out.println(ans);
    }

    private static int secondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
