public class multiplication {
    private int a;
    private int b;

    // Constructor
    public multiplication(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Method to multiply a and b
    public int multiply() {
        return a * b;
    }

    // Method to update values
    public void updateValues(int newA, int newB) {
        this.a = newA;
        this.b = newB;
    }

    // Method to display result
    public void displayResult() {
        System.out.println("Multiplying " + a + " and " + b);
        System.out.println("Result: " + multiply());
    }

    // Main method for testing
    public static void main(String[] args) {
        multiplication obj = new multiplication(5, 6);
        obj.displayResult();

        // Update and display again
        obj.updateValues(10, 20);
        System.out.println("\nAfter updating values: after the calculation");
        obj.displayResult();
    }
}
