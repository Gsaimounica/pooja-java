interface I1 {
    void show();
}

class C1 implements I1 {
    public void show() {
        System.out.println("Implemented method from I1");
    }

    public static void main(String[] args) {
        C1 obj = new C1();
        obj.show();
    }
}
