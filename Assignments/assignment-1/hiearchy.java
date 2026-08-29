class Animal {
    void eat() { System.out.println("Eating..."); }
}

// Subclass 1
class Dog extends Animal {
    void bark() { System.out.println("Barking..."); }
}

// Subclass 2 (shares the same parent Animal with Dog)
class Cat extends Animal {
    void meow() { System.out.println("Meowing..."); }
}

public class HierarchicalInheritanceExample {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.eat();  // Inherited from Animal
        myCat.meow(); // Unique to Cat
        
        Dog myDog = new Dog();
        myDog.eat();  // Inherited from Animal
        myDog.bark(); // Unique to Dog
    }
}
