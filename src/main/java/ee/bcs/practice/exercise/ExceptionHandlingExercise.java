package ee.bcs.practice.exercise;

import java.io.IOException;

public class ExceptionHandlingExercise {

    public static void main(String[] args) {

        // Test Exercise 1: Implement Division
        System.out.println("Testing divideNumbers method:");
        System.out.println("Result: " + divideNumbers(10, 2)); // Should print 5
        System.out.println("Result: " + divideNumbers(10, 0)); // Should print error message and 0

        // Test Exercise 2: Array Index Validation
        System.out.println("\nTesting getArrayElement method:");
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Element at index 2: " + getArrayElement(array, 2)); // Should print 3
        System.out.println("Element at index 10: " + getArrayElement(array, 10)); // Should print error message and -1

        // Test Exercise 3: Custom Exception Throwing
        System.out.println("\nTesting validateAge method:");
        try {
            validateAge(15); // Should throw IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage()); // Should print error message
        }
        validateAge(20); // No exception should be thrown

        // Test Exercise 4: Resource Cleanup
        System.out.println("\nTesting handleResources method:");
        handleResources(); // Should print resource handling and cleanup messages

        // Test Exercise 5: Method Declaration with Throws
        System.out.println("\nTesting readFile method:");
        try {
            readFile(); // Should throw IOException
        } catch (IOException e) {
            System.out.println("Caught exception: " + e.getMessage()); // Should print error message
        }

        // Run main method

    }

    // Exercise 1: Implement Division
    private static int divideNumbers(int numerator, int denominator) {
        return 0;
    }

    // Exercise 2: Array Index Validation
    private static int getArrayElement(int[] array, int index) {
        return -1; // Return a default value or handle appropriately
    }

    // Exercise 3: Custom Exception Throwing
    private static void validateAge(int age) {
    }

    // Exercise 4: Resource Cleanup
    private static void handleResources() {
    }

    // Exercise 5: Method Declaration with Throws
    private static void readFile() throws IOException {
    }
}