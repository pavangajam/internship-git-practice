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
        System.out.println("hello from pr1");
    }

    public static void main(String[] args) {
        addition obj = new addition(10, 20);
        obj.displayResult();
    }
}
