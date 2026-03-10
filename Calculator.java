class Calculator {

    public void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(10, 20);
    }
}