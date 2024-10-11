package ee.bcs.practice.demo;

import java.util.Scanner;

public class ConsoleInputExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your FIRST NAME:");
        String userInput = scanner.nextLine();
        System.out.println( userInput + " is a great first name:");

        System.out.println("Please enter your LAST NAME:");
        userInput = scanner.nextLine();
        System.out.println( userInput + " is a very noble last name.");

        System.out.println("What country are you from? ");
        userInput = scanner.nextLine();
        System.out.println( userInput + " is a beautiful country.");

        scanner.close();
    }

}

