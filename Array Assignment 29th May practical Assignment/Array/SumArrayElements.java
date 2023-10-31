public class SumArrayElements {
    public static void main(String[] args) {
        // Define an integer array
        int[] numbers = {1, 2, 3, 4, 5};

        // Call a method to calculate the sum
        int sum = calculateSum(numbers);

        // Display the result
        System.out.println("The sum of the array elements is: " + sum);
    }

    public static int calculateSum(int[] arr) {
        int sum = 0;

        // Iterate through the array and add each element to the sum
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }
}
