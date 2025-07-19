public class subtraction {
    private String message;
    private int number;
    private int subtractFrom; // new field

    // Constructor
    public subtraction(String message, int number) {
        this.message = message;
        this.number = number;
        this.subtractFrom = 0; // default value
    }

    // Overloaded constructor to set subtractFrom value
    public subtraction(String message, int number, int subtractFrom) {
        this.message = message;
        this.number = number;
        this.subtractFrom = subtractFrom;
    }

    // Getter methods
    public String getMessage() {
        return message;
    }

    public int getNumber() {
        return number;
    }

    public int getSubtractFrom() {
        return subtractFrom;
    }

    // Method to perform subtraction
    public int performSubtraction() {
        int result = subtractFrom - number;
        if (result < 0) {
            System.out.println("Warning: Result is negative.");
        }
        return result;
    }

    // Method to update values
    public void updateInfo(String newMessage, int newNumber, int newSubtractFrom) {
        this.message = newMessage;
        this.number = newNumber;
        this.subtractFrom = newSubtractFrom;
    }

    // Display method
    public void displayInfo() {
        System.out.println("Message: " + message);
        System.out.println("Number: " + number);
        System.out.println("Subtracting " + number + " from " + subtractFrom);
        System.out.println("Result: " + performSubtraction());
    }

    // Main method for testing
    public static void main(String[] args) {
        subtraction obj = new subtraction("Performing subtraction", 5, 10);
        obj.displayInfo();

        // Updating values
        obj.updateInfo("Updated subtraction", 7, 20);
        System.out.println("\nAfter update:");
        obj.displayInfo();
    }
}
