package reflection;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception{
        printClassInfo("".getClass());
        printClassInfo(int.class);
        printClassInfo(java.time.Month.class);
        printClassInfo(String[].class);

        Class stdclass = Student.class;
        System.out.println(stdclass.getMethod("getScore", String.class));
        System.out.println(stdclass.getMethod("getName"));
        System.out.println(stdclass.getDeclaredMethod("getGrade", int.class));
        Method m = stdclass.getMethod("getName");
        String s = "Hello World";
        Method n = Integer.class.getMethod("parseInt", String.class);
        Integer r = (Integer)n.invoke(null,"123");
        System.out.println(r);
        Integer a = 2;
    }

    static void printClassInfo(Class cls) {
        System.out.println("Class name: "+cls.getName());
        System.out.println("Simple name: "+cls.getSimpleName());
        if (cls.getPackage() != null) {
            System.out.println("Package name: "+cls.getPackage().getName());
        }
        System.out.println("is interface: "+cls.isInterface());
        System.out.println("is enum: "+cls.isEnum());//枚举
        System.out.println("is array: "+cls.isArray());//数组
        System.out.println("is primitive: "+cls.isPrimitive());//基本类型

    }

    class Student extends Person {
        public int getScore(String type) {
            return 99;
        }
        private int getGrade(int year){
            return 1;
        }

    }

    class Person {
        public String getName(){
            return "Person";
        }
    }
}
