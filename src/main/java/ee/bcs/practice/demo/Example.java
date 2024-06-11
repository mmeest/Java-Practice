package ee.bcs.practice.demo;

public class Example {
    public void publicMethod() {
        System.out.println("This is a public method.");
        privateMethod();
    }

    private void privateMethod() {
        System.out.println("This is a private method.");
    }
}
