package inheritance;
interface I1{
    int x=100;
    void sample();
}
interface I2 extends I1{
    int y=200;
    void demo();
}
class multi implements I1,I2{
    @override
    public viod sample(){
        system.out.println("This is from interface 1");
    }
    @override 
    public viod demo(){
        system.out.println("This is from interface 2");
    }
    void mymethod(){
        system.out.println("From child class");
    }
}
public class ImplementMultipleInheritance{
    public static void main(string[]args){
        multi mlt=new multi();
        system.out.println(I1.x);
        system.out.println(I2.y);
        mlt.demo();
        mlt.sample();
        mlt.mymethod();
    ]
}
