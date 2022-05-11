package Function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.function.*;

public class Stream1 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("A","B","C","D");
        stream.forEach(System.out::println);

        Stream<String> stream1 = Arrays.stream(new String[] {"A","B","C"});
        Stream<String> stream2 = List.of("A","B","C").stream();
        stream1.forEach(System.out::println);
        stream2.forEach(System.out::println);

        Stream<Integer> natural = Stream.generate(new NaturalSupplier());
        natural.limit(20).forEach(System.out::println);

        IntStream is = Arrays.stream(new int[] {1,2,3});
        LongStream ls = List.of("1","2","3").stream().mapToLong(Long::parseLong);
        is.forEach(System.out::println);
        ls.forEach(System.out::println);
    }
}

class NaturalSupplier implements Supplier<Integer> {
    int n = 0;
    public Integer get() {
        n++;
        return n;
    }
}