public class PrintArray {
    public static void main(String[] args) {
        // Define an integer array
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};

        // Call a method to print the array
        printIntArray(numbers);
    }

    public static void printIntArray(int[] arr) {
        System.out.print("Array Elements: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // Print each element followed by a space
        }
        System.out.println(); // Print a newline character to move to the next line
    }
}
