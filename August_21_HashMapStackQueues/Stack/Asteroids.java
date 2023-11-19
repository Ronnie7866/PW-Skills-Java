package August_21_HashMapStackQueues.Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Asteroids {
    private static int[] function(int[] arr) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {// srf positive value insert in the stack
                st.push(arr[i]);
            }
            else { // mtlb negative value aayi h arr[i] me
                // agr st empty ni h and st ke peek pr + value h and abs of arr[i] > st ke peek
                while (!st.isEmpty() && st.peek() > 0 && Math.abs(arr[i]) > st.peek()) {
                    st.pop();
                }
            }
            if (!st.isEmpty() && st.peek() == Math.abs(arr[i])) {
                st.pop();
            }
            else {
                if (st.isEmpty() || st.peek() < 0) {
                    st.push(arr[i]);
                }
            }
        }

        int[] ans = new int[st.size()];
        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {10,2,-5};
        int[] ans = function(arr);
        System.out.println(Arrays.toString(ans));
    }
}
