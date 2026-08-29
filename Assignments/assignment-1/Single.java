// Superclass (Parent)
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass (Child) inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class SingleInheritanceExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat(); // Inherited method from Animal
        myDog.bark(); // Own method from Dog
    }
}
