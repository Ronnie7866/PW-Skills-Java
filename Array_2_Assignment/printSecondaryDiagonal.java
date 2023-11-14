package Array_2_Assignment;

import java.util.Scanner;

public class printSecondaryDiagonal {
    private static void secondDiagonal(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length-1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < col - i; j++) {
                    System.out.println(arr[i][j]);
            }
        }
    }
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

        secondDiagonal(arr);
    }
}
