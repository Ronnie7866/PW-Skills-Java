package StringAssingment.Question_1;

public class RemoveCharacterFromString {
    public static void main(String[] args) {
        String originalString = "Hello, World!";
        char charToRemove = 'o';

        // Remove the specified character from the string
        String resultString = removeCharacter(originalString, charToRemove);

        System.out.println("Original String: " + originalString);
        System.out.println("Character to remove: " + charToRemove);
        System.out.println("String after removal: " + resultString);
    }

    public static String removeCharacter(String input, char charToRemove) {
        char[] inputArray = input.toCharArray();
        int inputLength = inputArray.length;
        int newLength = 0;

        // Count the occurrences of the character to be removed
        for (int i = 0; i < inputLength; i++) {
            if (inputArray[i] != charToRemove) {
                inputArray[newLength] = inputArray[i];
                newLength++;
            }
        }

        // Construct a new string without the specified character
        return new String(inputArray, 0, newLength);
    }
}
