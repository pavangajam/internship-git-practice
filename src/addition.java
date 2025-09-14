public class addition {
    private int a;
    private int b;

    // Constructor
    public addition(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Add method
    public int add() {
        long result = (int) a + (long) b; // avoid overflow
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            throw new ArithmeticException("Integer overflow in addition.");
        }
        System.out.println("change to create conflict");
        return (int) result;
    }

    // Method to update values
    public void updateValues(int newA, int newB) {
        this.a = newA;
        this.b = newB;
    }

    // Display method
    public void displayResult() {
        System.out.println("Adding " + a + " and " + b);
        try {
            System.out.println("Result: " + add());
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        addition obj = new addition(10, 20);
        obj.displayResult();

        // Update and display again
        obj.updateValues(1000000000, 1500000000);
        System.out.println("\nAfter updating values:");
        obj.displayResult();
        System.out.println("clear structure");
    }
}
