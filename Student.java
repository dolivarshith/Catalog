class Student {

    private String name = "Varshith";

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.getName());
    }
}