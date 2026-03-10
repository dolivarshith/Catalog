class Person {

    private String name = "John";
    private int age = 25;

    public void display() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.display();
    }
}