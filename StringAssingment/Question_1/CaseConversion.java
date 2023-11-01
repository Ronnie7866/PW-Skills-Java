package StringAssingment.Question_1;

import java.util.Scanner;

public class CaseConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("Choose an option:");
        System.out.println("1. Convert to Uppercase");
        System.out.println("2. Convert to Lowercase");
        int choice = scanner.nextInt();

        String result = null;

        switch (choice) {
            case 1:
                result = input.toUpperCase();
                break;
            case 2:
                result = input.toLowerCase();
                break;
            default:
                System.out.println("Invalid option");
                break;
        }

        if (result != null) {
            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}
