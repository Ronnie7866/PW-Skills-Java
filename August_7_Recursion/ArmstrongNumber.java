package August_7_Recursion;

import java.util.Arrays;

public class ArmstrongNumber {
    private static boolean isArmstrongNumber(int n) {
        String s = Integer.toString(n);
        int nLength = s.length();

        int armstrongSum = calculateArmstrongNumber(n,nLength);
        return armstrongSum == n;
    }

    private static int calculateArmstrongNumber(int n, int nLength) { // 123
        if (n == 0) return 0;
        int digit = n % 10; // last digit
        return (int) Math.pow(digit, nLength) + calculateArmstrongNumber(n / 10, nLength);
    }

    public static void main(String[] args) {
        int n = 153;
        System.out.println(isArmstrongNumber(n));
    }
}
