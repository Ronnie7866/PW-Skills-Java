package Array_24th_JulyAssignments.Array_2_Assignment;

import java.util.Scanner;

public class ElementsOfBothTheDiagonals {

    private static void diagonalsElements(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][i]);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][arr.length-1-i]);
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
        diagonalsElements(arr);
    }
}
