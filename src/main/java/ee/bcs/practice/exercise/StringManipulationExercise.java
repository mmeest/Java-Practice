package ee.bcs.practice.exercise;

public class StringManipulationExercise {

    public static void main(String[] args) {

        // Exercise 1: Create and Print String
        String greeting = "Hello, World!";

        System.out.println(greeting);

        // Exercise 2: Determine the Length of a String
        System.out.println("Length of greeting: " + greeting.length());

        // Exercise 3: Concatenate Strings
        // Using + operator
        // Using concat() method
        String firstName = "John";
        String lastName = "Doe";

        System.out.println("Full name using + operator: " + firstName + " " + lastName);
        System.out.println("Full name using concat() method: ".concat(firstName.concat(" ".concat(lastName))));

        // Exercise 4: Access a Character at a Specific Position
        char firstChar = greeting.charAt(0);

        System.out.println("First character: " + firstChar);

        // Exercise 5: Extract a Substring
        String sub = greeting.substring(7);
        String subRange = greeting.substring(7, 12);

        System.out.println("Substring from index 7: " + sub);
        System.out.println("Substring from index 7 to 12: " + subRange);

        // Exercise 6: Find the Index of a Character or Substring
        int index = greeting.indexOf('o');
        System.out.println("Index of first 'o': " + index);

        int lastIndex = greeting.lastIndexOf('o');
        System.out.println("Index of last 'o': " + lastIndex);

        int substringIndex = greeting.indexOf("World");
        System.out.println("Index of 'World': " + substringIndex);

        // Exercise 7: Replace Characters or Substrings
        String replaced = greeting.replace('o', 'a');
        System.out.println("Replaced 'o' with 'a': " + replaced);

        String replacedAll = greeting.replaceAll("World", "Java");
        System.out.println("Replaced 'World' with 'Java': " + replacedAll);

        // Exercise 8: Change Case of a String
        String upper = greeting.toUpperCase();
        System.out.println("Uppercase: " + upper);

        String lower = greeting.toLowerCase();
        System.out.println("Lowercase: " + lower);

        // Exercise 9: Trim Whitespace from a String
        String padded = " Hello, World! ";
        String trimmed = padded.trim();
        System.out.println("Trimmed string: " + trimmed);

        // Exercise 10: Compare Strings
        String a = "hello";
        String b = "hello";
        boolean isEqual = a.equals(b);
        System.out.println("String equal (case-sensitive): " + isEqual);

        b = "Hello";
        boolean isEqualIgnoreCase = a.equalsIgnoreCase(b);
        System.out.println("String equal (ignore case): " + isEqualIgnoreCase);

        // Exercise 11: Display Tic-Tac-Toe Board
        String text = "x\to\to\no\tx\to\nx\to\tx";
        System.out.println(text);

        // Exercise 12: Use String Literals Directly
        System.out.println("Length of 'Code': " + "Code".length());
        System.out.println("Lowercase of 'JAVA': " + "JAVA".toLowerCase());
        System.out.println("Replacing 'e' with 'a' in 'exercise': " + "exercise".replace('e', 'a'));

        boolean containsSubstring = "Programming".contains("gram");
        System.out.println("'Programming' contain 'gram'? " + containsSubstring);

        // Exercise 13: Chaining String Methods
        String result = " Learn Java Programming ".trim().substring(0, 5).toUpperCase();
        System.out.println("Final result: " + result);

        // Run main method


    }
}



