package Array_1_Assingment;

public class SumOfElementsPresentOnEvenIndices {
    public static void main(String[] args) {
        int[] arr = {3,20,4,6,9};// output 16
        int ans = SumOfElement(arr);
        System.out.println(ans);
    }

    private static int SumOfElement(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }
}
