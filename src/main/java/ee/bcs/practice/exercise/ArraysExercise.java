package ee.bcs.practice.exercise;

import java.util.Scanner;

public class ArraysExercise {

    public static void main(String[] args) {

        // Exercise 1: Create and Print Array
        int[] numbers = { 10, 20, 30, 40, 50};
        for(int i = 0; i <= numbers.length -1; i++){
            System.out.println(numbers[i]);
        }

        // Exercise 2: Array Length
        String[] fruits = {"apple", "banana", "cherry"};
        System.out.println(fruits[1]);
        System.out.println(fruits.length);

        // Exercise 3: Access Array Elements
        double[] values = {1.1, 2.2, 3.3, 4.4};
        System.out.println(values[1]);
        System.out.println(values[3]);

        // Exercise 4: Two-Dimensional Array
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };
        System.out.println(matrix[0][1]);
        System.out.println(matrix[1][2]);

        // Exercise 5: Choose Your Favorite Fruit
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a fruit: 0 apple, 1 banana, 2 cherry");
        int chosenFruitIndex = scanner.nextInt();
        System.out.println("You chose: " + fruits[chosenFruitIndex]);

        scanner.close();

        // Run main method

    }
}