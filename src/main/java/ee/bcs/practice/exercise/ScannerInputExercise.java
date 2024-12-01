package ee.bcs.practice.exercise;

import java.util.Scanner;

public class ScannerInputExercise {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Exercise 1: First and Last Name Input
        System.out.println("Please enter your FIRST NAME: ");
        String firstName = scanner.nextLine();
        System.out.println("Please enter your LAST NAME: ");
        String lastName = scanner.nextLine();
        System.out.println("Hello " + firstName + " " + lastName + "! Welcome.");

        // Exercise 2: Choose a number
        System.out.println("Please enter a number between 1 and 10: ");
        int number = scanner.nextInt();
        System.out.println("Your chosen number is: " + number);

        // Run main method

        scanner.close();
    }
}
