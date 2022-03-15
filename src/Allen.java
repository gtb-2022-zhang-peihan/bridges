public class Allen {
    public static void main(String[] args) {
        Person z = new Person("zhang",25);
        System.out.println(z.getFirstname());
        System.out.println(z.getAge());
        Person y = new Person("yang");
        System.out.println(y.getAge());
        HHello zh = new HHello();
        zh.hello("zhangpeihan");
        zh.hello("zhangyong",52);
    }
}

class Person {
    private String firstname = "unnamed";
    private int age = 1;

    public Person(String firstname) {
        this(firstname,18);
    }

    public Person() {

    }

    public Person(String firstname, int age) {
        this.firstname = firstname;
        this.age = age;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public int getAge() {
        return this.age;
    }
}

class HHello {
    public void hello() {
        System.out.println("Hello, world!");
    }

    public void hello(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public void hello(String name, int age) {
        if (age < 18) {
            System.out.println("Hi, " + name + "!");
        } else {
            System.out.println("Hello, " + name + "!");
        }
    }
}

