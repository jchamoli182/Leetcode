package Java2;

import java.util.HashMap;
import java.util.Map;

public class Child extends AbstractClass {

    int a = 10;
    String s = "Jayesh";

    

    @Override
    void hello() {
       System.out.println("Calling abstract method from child class");
    }

    public void Hello(){
        System.out.println("Calling from child class");
    }

    public void Hello(String s){
        System.out.print(s);
    }


    HashMap<Integer,Integer> mp = new HashMap<>();

    public void printMapEntries() {
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            // Your logic here, for example:
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }


    
    
}