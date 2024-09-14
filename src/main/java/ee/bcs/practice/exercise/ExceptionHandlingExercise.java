package ee.bcs.practice.exercise;

import java.io.IOException;

public class ExceptionHandlingExercise {

    // Exercise 1: Implement Division
    public int divideNumbers(int numerator, int denominator) {
        return 0;
    }

    // Exercise 2: Array Index Validation
    public int getArrayElement(int[] array, int index) {
        return -1; // Return a default value or handle appropriately
    }

    // Exercise 3: Custom Exception Throwing
    public void validateAge(int age) {
    }

    // Exercise 4: Resource Cleanup
    public void handleResources() {
    }

    // Exercise 5: Method Declaration with Throws
    public void readFile() throws IOException {
    }

    public static void main(String[] args) {
        // Create an instance of the class
        ExceptionHandlingExercise exceptionHandlingExercise = new ExceptionHandlingExercise();

        // Test Exercise 1: Implement Division
        System.out.println("Testing divideNumbers method:");
        System.out.println("Result: " + exceptionHandlingExercise.divideNumbers(10, 2)); // Should print 5
        System.out.println("Result: " + exceptionHandlingExercise.divideNumbers(10, 0)); // Should print error message and 0

        // Test Exercise 2: Array Index Validation
        System.out.println("\nTesting getArrayElement method:");
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Element at index 2: " + exceptionHandlingExercise.getArrayElement(array, 2)); // Should print 3
        System.out.println("Element at index 10: " + exceptionHandlingExercise.getArrayElement(array, 10)); // Should print error message and -1

        // Test Exercise 3: Custom Exception Throwing
        System.out.println("\nTesting validateAge method:");
        try {
            exceptionHandlingExercise.validateAge(15); // Should throw IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage()); // Should print error message
        }
        exceptionHandlingExercise.validateAge(20); // No exception should be thrown

        // Test Exercise 4: Resource Cleanup
        System.out.println("\nTesting handleResources method:");
        exceptionHandlingExercise.handleResources(); // Should print resource handling and cleanup messages

        // Test Exercise 5: Method Declaration with Throws
        System.out.println("\nTesting readFile method:");
        try {
            exceptionHandlingExercise.readFile(); // Should throw IOException
        } catch (IOException e) {
            System.out.println("Caught exception: " + e.getMessage()); // Should print error message
        }
    }
}