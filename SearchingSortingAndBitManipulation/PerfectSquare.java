package SearchingSortingAndBitManipulation;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        boolean ans = isSquareRoot(n);
        System.out.println(ans);
    }

    private static boolean isSquareRoot(int n) {
        int low = 0;
        int high = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int square = mid * mid;
            if (square == n) {
                return true;
            } else if (square < n) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return false;
    }
}
