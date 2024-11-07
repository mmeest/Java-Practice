package ee.bcs.practice.demo;


public class ClassA {


    // main method
    public static void main(String[] args) {
        printMessage();
    }

    // called method
    private static void printMessage() {
        System.out.println("Hello, world!");
    }


    // A public method - can be accessed from other classes
    public void publicMethod() {
        System.out.println("This is a public method in ClassA.");
        addNumbersMethod();
    }

    // this gets executed
    public void addNumbersMethod() {

        // Calling the addNumbers method and storing the returned result
        int result = addNumbers(5, 3);

        // Printing the result
        System.out.println("The sum is: " + result);

    }

    // A method that adds two numbers and returns the result
    public int addNumbers(int a, int b) {
        int sum = a + b;
        return sum; // Returning the result of the addition
    }

    private void privateMethod() {
        System.out.println("This is a private method in ClassA.");
    }

    private void printGreeting(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }


}































