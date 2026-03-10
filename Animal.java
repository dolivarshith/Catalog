class Animal {

    protected void eat() {
        System.out.println("Animal is eating");
    }
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
    }
}

class Dog extends Animal {

    
}