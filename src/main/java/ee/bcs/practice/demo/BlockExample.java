package ee.bcs.practice.demo;

public class BlockExample {

    public void conditionalBlockExample() {
        // if condition purposely valued to true
        if (true) {
            // Local variable in an if block
            int blockVariable = 5;
            System.out.println("Block Variable:");
            System.out.println(blockVariable);
        }
        // blockVariable is not accessible here
    }


    public void standaloneBlockExample() {
        {
            // Local variable in a standalone block
            int standaloneBlockVariable = 10;
            System.out.println("Standalone Block Variable:");
            System.out.println(standaloneBlockVariable);
        }
        // standaloneBlockVariable is not accessible here
    }

}



