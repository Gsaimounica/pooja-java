class C2 {
    void displayC2() {
        System.out.println("Base Class C2");
    }
}

class C1 extends C2 {
    public static void main(String[] args) {
        C1 obj = new C1();
        obj.displayC2();
    }
}
