package Function;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FIlterr {
    public static void main(String[] args) {
        IntStream.of(1,2,3,6,4)
                .filter(a -> a % 2 != 1)
                .forEach(System.out::println);

        Stream<String> stream = Stream.of("APPLe","",null,"Pear"," ","Orange");
        List<String> list = stream.filter(s -> s != null && !s.isBlank()).collect(Collectors.toList());
        System.out.println(list);
        String[] array = list.stream().toArray(String[]::new);
        for(String i : array){
            System.out.println(i);
        }

        String A = "AAA";
        System.out.println(A.length());
    }
}
