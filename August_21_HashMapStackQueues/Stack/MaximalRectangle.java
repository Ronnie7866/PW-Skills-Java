package August_21_HashMapStackQueues.Stack;

import java.util.Arrays;
import java.util.Stack;

public class MaximalRectangle {
    private static int[] nextSmallerElement(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];
        ans[arr.length - 1] = arr.length;
        st.push(arr.length - 1);

        for (int i = arr.length - 2; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ans[i] = arr.length;
            } else ans[i] = st.peek();
            st.push(i);
        }
        return ans;
    }

    private static int[] previousSmallerElement(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];
        st.push(0);
        ans[0] = -1;

        for (int i = 1; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ans[i] = -1;
            } else ans[i] = st.peek();
            st.push(i);
        }
        return ans;
    }

    public static int largestRectangleArea(int[] arr) {
        int n = arr.length;
        int[] nse = nextSmallerElement(arr);
        int[] pse = previousSmallerElement(arr);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int area = arr[i] * (nse[i] - pse[i] - 1);
            max = Math.max(max, area);
        }
        return max;
    }
    public static void main(String[] args) {
        int max = 0;
        char[][] arr = {{'1','0','1','0','0'}
                       ,{'1','0','1','1','1'}
                       ,{'1','1','1','1','1'}
                       ,{'1','1','0','1','0'}};
        // check every row maximum rectangle area
        int[] histogram = new int[arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < histogram.length; j++) {
                if (arr[i][j] == '1') {
                    histogram[j]++;
                }
                else histogram[j] = 0;
            }
            int currLargest = largestRectangleArea(histogram);
            max = Math.max(max, currLargest);
        }
        System.out.println(max);
    }
}
