package StringAssingment.Question_1;

public class SubstringIndex {
    public static void main(String[] args) {
        String mainString = "Hello, this is a sample string for testing.";
        String substring = "sample";

        int index = findSubstringIndex(mainString, substring);

        if (index != -1) {
            System.out.println("Substring '" + substring + "' found at index: " + index);
        } else {
            System.out.println("Substring '" + substring + "' not found in the main string.");
        }
    }

    public static int findSubstringIndex(String mainString, String substring) {
        // Use the indexOf() method to find the index of the substring
        int index = mainString.indexOf(substring);
        return index;
    }
}
