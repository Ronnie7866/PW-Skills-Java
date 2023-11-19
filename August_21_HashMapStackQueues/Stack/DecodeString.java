package August_21_HashMapStackQueues.Stack;

import java.util.Stack;

public class DecodeString {

    public static String decodeString(String s) {
        Stack<String> strStack = new Stack<>();
        Stack<Integer> numStack = new Stack<>();
        StringBuilder currentStr = new StringBuilder();
        int currentNum = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                currentNum = currentNum * 10 + Character.getNumericValue(c);
            } else if (c == '[') {
                strStack.push(currentStr.toString());
                numStack.push(currentNum);
                currentStr = new StringBuilder();
                currentNum = 0;
            } else if (c == ']') {
                int num = numStack.pop();
                StringBuilder prevStr = new StringBuilder(strStack.pop());
                currentStr = prevStr.append(currentStr.toString().repeat(Math.max(0, num)));
            } else {
                currentStr.append(c);
            }
        }

        return currentStr.toString();
    }

    public static void main(String[] args) {
        String encodedString = "2[abc]331[cd]ef";
        String decodedString = decodeString(encodedString);
        System.out.println(decodedString);
    }
}
