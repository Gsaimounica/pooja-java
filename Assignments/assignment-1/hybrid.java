class Organism {
    void metabolize() {
        System.out.println("Metabolizing...");
    }
}

interface Worker {
    void work();
}

// Animal branch (Hierarchical part 1)
class AnimalKingdom extends Organism {
    void sleep() {
        System.out.println("Sleeping...");
    }
}

// Robot branch combining class inheritance and interface (Hybrid part)
class Android extends Organism implements Worker {
    public void work() {
        System.out.println("Android is working.");
    }
}

public class HybridInheritanceDemo {
    public static void main(String[] args) {
        Android android = new Android();
        android.metabolize(); // Inherited from Organism
        android.work();       // Implemented from Worker interface
    }
}
