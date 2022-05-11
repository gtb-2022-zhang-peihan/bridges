package Genetic;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] ss = new String[] { "Orange","Apple","Pear"};
        Arrays.sort(ss);
        System.out.println(Arrays.toString(ss));

        Person[] ps = new Person[] {
                new Person("Bob",55),
                new Person("Allen",89),
                new Person("Alice",67)
        };
        Arrays.sort(ps);
        System.out.println(Arrays.toString(ps));
    }
}

class Person implements Comparable<Person>{
    String name;
    int score;
    Person(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int compareTo(Person o) {
        return o.score-this.score;
    }

    public String toString() {
        return this.name+","+this.score;
    }
}

class Pair<T> {
    private T first;
    private T last;
    public Pair(T first, T last) {
        this.first = first;
        this.last = last;
    }
    public T getFirst(){
        return first;
    }
    public T getLast(){
        return last;
    }
}