package Array_24th_JulyAssignments.Array_2_Assignment;

import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int row = sc.nextInt();
        System.out.println("Enter number of Columns: ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter Elements: ");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int positive = numberOfPositiveNumber(arr);
        int negative = numberOfNegativeNumber(arr);
        int even = numberOfEvenNumber(arr);
        int odd = numberOfOddNumber(arr);
        int zeroes = numberOfZeroes(arr);
        System.out.println("Number of positive numbers " + positive);
        System.out.println("Number of negative numbers " + negative);
        System.out.println("Number of even numbers " + even);
        System.out.println("Number of odd numbers " + odd);
        System.out.println("Number of zeroes numbers " + zeroes);
    }



    private static int numberOfZeroes(int[][] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    private static int numberOfOddNumber(int[][] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] % 2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }

    private static int numberOfEvenNumber(int[][] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    private static int numberOfNegativeNumber(int[][] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] < 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int numberOfPositiveNumber(int[][] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] > 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
