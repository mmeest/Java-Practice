package ee.bcs.practice.exercise;

import java.util.Scanner;

public class WhileLoopExercise {

    public static void main(String[] args) {

        // Exercise 1: Simple While Loop
        int i = 1;
        while(i <= 10){
            System.out.println(i);
            i++;
        }

        // Exercise 2: Calculate Sum Using While Loop
        int sum = 0;
        int j = 1;
        while(j <= 10){
            sum += j;
            j++;
        }
        System.out.println("Sum of the first 10 positive integers: " + sum);

        // Exercise 3: Breaking a While Loop
        int k = 1;
        while(k <= 10){
            System.out.println(k);
            k++;
            if (k == 5){
                break;
            }
        }

        // Exercise 4: Prompt User Until Correct Input
        Scanner scanner = new Scanner(System.in);
        String inputNumber;
        while(true){
            System.out.println("Please enter new input number higher than 10");
            inputNumber = scanner.nextLine();
            System.out.println("User entered input number " + inputNumber);
            if(Integer.parseInt(inputNumber) > 10){
                System.out.println("Thank you for entering correct input number");
                break;
            }
        }


        // Run main method

    }
}
