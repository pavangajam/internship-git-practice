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
        System.out.println("Message: welcome back " + message);
        System.out.println("Number: after a long time.." + number);
    }

    // Main method for testing
    public static void main(String[] args) {
        hello obj = new hello("small change goes into new commit", 42);
        obj.displayInfo();
    }
}
