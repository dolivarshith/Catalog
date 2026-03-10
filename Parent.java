class Parent {

    protected int number = 50;
     public static void main(String[] args) {
        Child obj = new Child();
        System.out.println(obj.number);
    }
}

class Child extends Parent {

   
}