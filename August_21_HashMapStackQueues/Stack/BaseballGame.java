package August_21_HashMapStackQueues.Stack;

import java.util.Stack;

public class BaseballGame {

//    Record a new score of x.
//          '+'.
//    Record a new score that is the sum of the previous two scores.
//            'D'.
//    Record a new score that is the double of the previous score.
//              'C'.
//    Invalidate the previous score, removing it from the record.
    private static int calculatePoints(String[] arr) {
        Stack<Integer> st = new Stack<>();
        for (var i : arr) {
            if (i.equals("+")) {
                int a = st.pop();
                int newScore = a + st.peek();
                st.push(a);
                st.push(newScore);
            } else if (i.equals("D")) {
                st.push(2 * st.peek());
            } else if (i.equals("C")) {
                st.pop();
            } else st.push(Integer.parseInt(i));
        }
        int maxScore = 0;
        while (!st.isEmpty()) {
            maxScore = maxScore + st.pop();
        }
        return maxScore;
    }
    public static void main(String[] args) {
        String[] arr = {"5", "2", "C", "D", "+"};
        int ans = calculatePoints(arr);
        System.out.println(ans);
    }
}
