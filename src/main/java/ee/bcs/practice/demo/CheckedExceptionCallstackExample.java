package ee.bcs.practice.demo;

public class CheckedExceptionCallstackExample {

    public static void main(String[] args) {
        // The code within this try block is monitored for exceptions.
        try {

            // It calls methodA(), which might throw an Exception that is propagated upwards.
            methodA();

        // If an Exception occurs, it will be caught by the catch block below.
        } catch (Exception e) {
            System.out.println("Oh no! Something went wrong in callstack below!");
        }
    }

    // This method declares that it may throw an Exception.
    public static void methodA() throws Exception {
        // It calls methodB(), which might throw an Exception that is propagated upwards.
        methodB();
    }

    // This method declares that it may throw an Exception.
    public static void methodB() throws Exception {
        // It calls methodC(), which might throw an Exception that is propagated upwards.
        methodC();
    }

    // This method declares that it may throw an Exception.
    public static void methodC() throws Exception {
        // It calls methodD(), which might throw an Exception that is propagated upwards.
        methodD();
    }

    // This method declares that it may throw an Exception.
    public static void methodD() throws Exception {
        // Throw a generic checked exception
        throw new Exception("Oops... Something happened in methodD.");
    }
}
