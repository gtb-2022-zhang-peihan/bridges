package allen;
import java.util.HashMap;

public class InnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer("A");
        outer.asyncHello();

        HashMap<String, String> map1 = new HashMap<>();
        HashMap<String, String> map2 = new HashMap<>() {
        };
        HashMap<String, String> map3 = new HashMap<>() {
            {
                put("A", "1");
                put("B", "2");
            }
        };
        System.out.println(map3.get("A"));

        Outer1.StaticNested bb = new Outer1.StaticNested();
        bb.hello();
    }
}

class Outer{
    private String name;

    Outer(String name){
        this.name=name;
    }

    void asyncHello(){
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello, " + Outer.this.name);
            }
        };
        new Thread(r).start();
    }
}

class Outer1{
    private static String Name = "Outer1";

    private String name;

    Outer1(String name){
        this.name=name;
    }

    static class StaticNested {
        void hello(){
            System.out.println("Hello, " + Outer1.Name);
        }
    }
}

