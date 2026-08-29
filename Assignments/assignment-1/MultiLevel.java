class Animal {
    void eat() { System.out.println("Eating..."); }
}

// Dog inherits from Animal
class Dog extends Animal {
    void bark() { System.out.println("Barking..."); }
}

// Puppy inherits from Dog (Multilevel: Animal -> Dog -> Puppy)
class Puppy extends Dog {
    void weep() { System.out.println("Weeping..."); }
}

public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        Puppy myPuppy = new Puppy();
        myPuppy.eat();  // From Animal
        myPuppy.bark(); // From Dog
        myPuppy.weep(); // From Puppy
    }
}
