package ee.bcs.practice.exercise;

public class ForLoopWithIndexExercise {

    public static void main(String[] args) {

        // Exercise 1: Print Numbers from 1 to 5 Using a For Loop
        for(int i = 1; i <= 5; i++){
            System.out.println(i);
        }

        // Exercise 2: Print Odd Numbers from 1 to 9
        for(int i = 1; i < 10; i+=2){
            System.out.println(i);
        }

        // Exercise 3: Print Numbers from 5 to 1 (Decrementing Loop)
        for(int i = 5; i >= 1; i--){
            System.out.println(i);
        }

        // Exercise 4: Iterate Over an Array and Print Elements
        int[] numbers = {10, 20, 30, 40, 50};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Exercise 5: Create a Multiplication Table Using Nested Loops
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <=5; j++){
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }

        // Run main method

    }
}
