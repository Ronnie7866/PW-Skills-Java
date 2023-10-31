public class FIndElementIndex {
    public static void main(String[] args) {
        // Define an integer array
        int[] numbers = {10, 20, 30, 40, 50};

        // Element to search for
        int targetElement = 30;

        // Call a method to find the index
        int index = findElementIndex(numbers, targetElement);

        // Check if the element was found
        if (index != -1) {
            System.out.println("Element " + targetElement + " found at index " + index);
        } else {
            System.out.println("Element " + targetElement + " not found in the array.");
        }
    }

    public static int findElementIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Element found, return its index
            }
        }
        return -1; // Element not found, return -1
    }
}
