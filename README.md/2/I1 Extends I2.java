interface I2 {
    void parentMethod();
}

interface I1 extends I2 {
    void childMethod();
}

class C1 implements I1 {
    public void parentMethod() {
        System.out.println("Method from parent interface I2");
    }

    public void childMethod() {
        System.out.println("Method from child interface I1");
    }

    public static void main(String[] args) {
        C1 obj = new C1();
        obj.parentMethod();
        obj.childMethod();
    }
}
