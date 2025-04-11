public class addition {
    private int a;
    private int b;

    public addition(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add() {
        return a + b;
    }

    public void displayResult() {
        System.out.println("The sum of " + a + " and " + b + " is: " + add());
    }

    public static void main(String[] args) {
        addition obj = new addition(10, 20);
        obj.displayResult();
    }
}
