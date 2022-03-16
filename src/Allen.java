public class Allen {
    public static void main(String[] args) {
        Person z = new Person("zhang",25);
        System.out.println(z.getName());
        System.out.println(z.getAge());
        Person y = new Person("yang");
        System.out.println(y.getAge());
        HHello zh = new HHello();
        zh.hello("zhangpeihan");
        zh.hello("zhangyong",52);
        Student q = new Student("aaa",15,85);
        Books maoxuan = new Books();
        maoxuan.setName("毛泽东选集");
        Student q1 = new Student(maoxuan);
        q1.reading();
        Person w = new Student("ff");
        Person w1 = new Person();
        System.out.println(q.getScore());
        System.out.println(q.getName());
        Person xiaoming = new Person("Xiaoming",12);
        Student xiaohong = new Student("Xiaohong",20,99);
        Student xiaojun = new PrimaryStudent("Xiaojun",9,100,5);
        System.out.println(xiaojun.getAge());
        System.out.println(xiaojun.getScore());
        System.out.println(xiaojun.getName());
        //System.out.println(xiaojun.getGrade());
    }
}



class Person {
    protected String name = "unnamed";
    protected int age = 1;

    public Person(String name) {
        this(name,18);
    }

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Student extends Person {
    protected Books books;
    protected int score;

    public Student(Books books) {
        this.books = books;
    }

    public void reading(){
        System.out.println(books.getName());
    }

    public Student(){
        super();
    }

    public Student(String name){

    }

    public Student(String name, int age, int score) {
        super(name,age);
        this.score =score;
    }

    public int getScore() {
        return this.score;
    }

}

class Books {
    protected String name;
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}



class PrimaryStudent extends Student {
    protected int grade;

    public PrimaryStudent(String name, int age, int score, int grade) {
        super(name,age,score);
        this.grade = grade;
    }

    public int getGrade() {
        return this.grade;
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

