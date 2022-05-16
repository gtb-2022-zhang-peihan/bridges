package Function;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.*;

public class Mapp {
    public static void main(String[] args){
        List.of(" Apple","Banana "," Pear ")
                .stream()
                .map(String::trim)
                .map(String::toLowerCase)
                .forEach(System.out::println);

        Stream<Integer> s = Stream.of(1,2,3,4,5);
        Stream<Integer> s1 = s.map(a -> a*a);
        s1.forEach(System.out::println);

        Stream<Long> s2 = Stream.generate(new NatualSupplier());

        Stream<Long> s3 = s2.map(n -> n*n);
        Stream<Long> s4 = s3.map(n -> n-1);
        System.out.println(s4);
    }
}

class NatualSupplier implements Supplier<Long> {
    long n = 1;
    public Long get() {
        n++;
        return n;
    }
}
