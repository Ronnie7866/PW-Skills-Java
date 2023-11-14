package Array_2_Assignment;

import java.util.Scanner;

public class PrintMiddleRowAndColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int row = sc.nextInt();
        System.out.println("Enter number of Columns: ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        int n = arr.length;
        System.out.println("Enter Elements: ");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        printMiddleRC(arr, n);
    }

    private static void printMiddleRC(int[][] arr, int n) {
        int middleRow = n/2;
        int middleCol = n/2;
        for (int i = 0; i < n; i++) { // printing row
            System.out.print(arr[middleCol][i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) { // printing cols
            System.out.print(arr[i][middleCol] + " ");
        }
    }
}