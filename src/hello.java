public class hello {
    private String message;
    private int number;

    // Constructor
    public hello(String message, int number) {
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
        hello obj = new hello("Conflicting changess", 42);
        obj.displayInfo();
    }
}
