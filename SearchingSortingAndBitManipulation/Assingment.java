package SearchingSortingAndBitManipulation;

import java.util.Scanner;

public class Assingment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched in array: ");
        int k = sc.nextInt();
        int ans = findNumber(arr,n,k);
        if (ans >= 0) {
            System.out.println("Element found at index : " + ans);
        }
    }

    private static int findNumber(int[] arr, int n, int k) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == k) return i;
        }
        System.out.println("Element not found in the Array ");
        return -1;
    }
}
