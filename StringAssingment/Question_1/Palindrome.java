package StringAssingment.Question_1;

public class Palindrome {
    public static boolean validPalindrome(String s) {
        s = s.trim();
        s = s.toLowerCase();
        char[] arr = s.toCharArray();
        int st = 0, end = arr.length-1;

        while (st < end) {
            if(arr[st] != arr[end]) return false;
            else {
                st++;
                end--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        if (validPalindrome(s)){
            System.out.println("The entered String is Palindrome ");
        }
        else System.out.println("The entered String is not Palindrome");
    }
}
