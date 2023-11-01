package StringAssingment.Question_3;

public class SentenceReverse {
    public static void main(String[] args) {
        String str1 = "Think Twice";
        String str2 = "";

        String arr[] = str1.split(" ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[i].length() - 1; j >= 0; j--) {
                str2 = str2 + arr[i].charAt(j);
            }
            str2 = str2 + " ";
        }

        System.out.println(str2);
    }
}
