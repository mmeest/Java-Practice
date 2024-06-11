package ee.bcs.practice.demo;

import java.util.Scanner;

public class StudentExample {

    public static void main(String[] args) {
        // Create a Scanner object to read from console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a student name
        System.out.print("Enter a student name: ");

        // Get studentName value from the console
        String studentName = scanner.nextLine();

        System.out.println("Student name: " + studentName);
        System.out.println("Saving student to database...");
        System.out.println("Student saved to database!");

        // Close the scanner to avoid resource leak
        scanner.close();

    }

}
