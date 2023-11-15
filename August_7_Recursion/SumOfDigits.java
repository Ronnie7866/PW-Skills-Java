package August_7_Recursion;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int ans = SOD(n);
        System.out.println(ans);
    }

    private static int SOD(int n) {// 12345
        if (n == 0) return 0;
        int lastDigit = n % 10;
        return lastDigit + SOD(n / 10);
    }
}
