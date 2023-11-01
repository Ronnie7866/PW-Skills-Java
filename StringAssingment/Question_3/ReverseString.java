package StringAssingment.Question_1;

public class ReverseString {
    public static String reverse_String(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String original = "AlakhPandey";
        String reverse = reverse_String(original);
        System.out.println(reverse);
    }
}
