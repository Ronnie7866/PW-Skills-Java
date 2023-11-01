package StringAssingment.Question_3;

import java.util.Arrays;

public class AlphabeticalSort {
    public static String sort(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return String.valueOf(arr);
    }
    public static void main(String[] args) {
        String s = "aabbzzncedt";;
        String t = sort(s);
        System.out.println(t);
    }
}
