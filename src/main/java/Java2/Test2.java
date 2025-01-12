package Java2;

public class Test2 extends Test1 {

    public Test2(){
        // this will call the constructor of test1;
        super("Jayesh");
        // super();
        System.out.println("this constructor will also be called when test2 object will be created");
    }

    

    
}
