package ee.bcs.practice.demo;

public class MethodsExample {

    public static void main(String[] args) {

        // Calling the public method
        Example example = new Example();
        example.publicMethod();

        // Calling the instance method
        Calculator calc = new Calculator();
        int addResult = calc.add(5, 3);
        System.out.println("Add result: " + addResult);

        // Calling the static method
        int result = MathUtils.multiply(5, 3);
        System.out.println("Multiply result: " + result);

    }

}


