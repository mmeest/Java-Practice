package ee.bcs.practice.exercise;

public class ForLoopWithCollectionExercise {

    public static void main(String[] args) {

        // Exercise 1: Iterate and Print Array Elements
        String[] fruits = {"Apple", "Banana", "Cherry"};
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Exercise 2: Calculate Sum of Integer Array Elements
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of elements: " + sum);

        // Exercise 3: Print Array Elements in Uppercase
        String[] colors = { "Red", "Green", "Blue" };
        for (String color : colors) {
            System.out.println(color.toUpperCase());
        }

        // Run main method

    }
}
