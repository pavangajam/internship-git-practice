public class subtraction {
    private String message;
    private int number;

    // Constructor
    public subtraction(String message, int number) {
        this.message = message;
        this.number = number;
    }

    // Getter methods
    public String getMessage() {
        return message;
    }

    public int getNumber() {
        return number;
    }

    // Display method
    public void displayInfo() {
        System.out.println("Message: " + message);
        System.out.println("Number: " + number);
    }

    // Main method for testing
    public static void main(String[] args) {
        hello obj = new hello("New file addition",2);
        obj.displayInfo();
    }
}
