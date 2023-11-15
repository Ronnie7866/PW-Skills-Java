package August_7_Recursion;

public class SumOfElement{
    private static int function(int[] arr, int idx) {
        if(idx == arr.length-1) return arr[idx];
        return arr[idx] + function(arr, idx + 1);

    }
    public static void main(String[] args) {
        int[] arr = {92, 23, 15, -20, 10};
        int ans = function(arr, 0);
        System.out.println(ans);
    }
}
