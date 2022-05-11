package Function;

import java.util.Arrays;
import java.util.*;
import java.util.stream.*;

public class Methodref {
    public static void main(String[] args) {
        String[] array = new String[] {"Apple", "banana", "Lemon", "Orange"};
        Arrays.sort(array, Methodref::cmp);
        //Arrays.sort(array, String::compareToIgnoreCase);
        System.out.println(String.join(",",array));

        List<String> names = List.of("Allen", "Bob", "Tim");
        List<Person> persons = names.stream().map(Person::new).collect(Collectors.toList());
        System.out.println(persons);
    }
    static int cmp(String s1, String s2){
        return s1.compareToIgnoreCase(s2);
    }
}

class Person {
    String name;
    public Person(String name) {
        this.name = name;
    }
    public String toString() {
        return "Person:"+ this.name;
    }
}