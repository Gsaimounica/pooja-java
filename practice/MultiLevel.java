class A{
    int a=12;
    void method1(){
        int b=12;
     System.out.println("output from class A="+(a+b));
    }
}
class B extends A{
    int x=20;
   void method2(){
    System.out.println("output from class B="+(super.a+this.x));
   }
}
class C extends B{
    void method3(){
        System.out.println("output from class C="+(super.x));
    }
}
public class MultiLevel {
    public static void main(String args[]){
        System.out.println("output from main class");
        C obj1=new C();
        obj1.method1();
        obj1.method2();
        obj1.method3();
    }
}
