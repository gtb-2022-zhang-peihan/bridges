package Function;

import java.util.Arrays;

public class Lambdaa {
    public static void main(String[] args) {
        String[] array = new String[] {"apple", "Orange", "Banana", "Lemon"};
        Arrays.sort(array,(s1,s2) ->{
            return s1.compareToIgnoreCase(s2);
        });
        System.out.println(String.join(",",array));
    }
}
