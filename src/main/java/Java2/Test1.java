package Java2;

public class Test1 {
    private static  String s;

    public Test1(){
        System.out.println("this constructor will be called from test 1 class");
    }

    public Test1(String s){
        this();
        System.out.println("This constructor will called if something is passed");

    }

    public static void print(){
        System.out.println(s);
    }



}
