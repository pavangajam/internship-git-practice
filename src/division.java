public class division {
    private double a;
    private double b;

    // Constructor
    public division(double a, double b) {
        this.a = a;
        this.b = b;
    }

    // Method to perform division
    public double divide() {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero, only will be divided by greater than 0.");
        }
        return a / b;
    }

    // Method to update values
    public void updateValues(double newA, double newB) {
        this.a = newA;
        this.b = newB;
    }

    // Display method
    public void displayResult() {
        System.out.println("Dividing " + a + " by " + b);
        try {
            System.out.println("Result: " + divide());
            System.out.println("conflicting change!!");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        division obj = new division(10, 2);
        obj.displayResult();

        // Try dividing by zero
        obj.updateValues(10, 0);
        System.out.println("\nAfter updating values:");
        obj.displayResult();
    }
}
