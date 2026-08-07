package inheritance
abstract class base{
	int x;
    void sayMyName(){
        system.out.println("my name is ABCD");
    }
    abstract sayMyAge();
}
public class AbstractDemo extends base{

    @override
    viod sayMyAge(){
        system.out.println("Age in sub class is: 19");
    }
    public static viod main(string[]args){
        AbstractDemo ad=new AbstractDemo();
        system.out.println(ad.x);
        ad.sayMyName();
        ad.sayMyAge();
    }
}