class Vehicle {

    protected String type = "Car";

    void display() {
        System.out.println("Vehicle type: " + type);
    }
     public static void main(String[] args) {
        Test t = new Test();
        t.display();
    }
}

class Test extends Vehicle {

   
}
