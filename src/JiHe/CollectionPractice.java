package JiHe;
import java.io.UnsupportedEncodingException;
import java.util.*;
;

public class CollectionPractice {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add(null);
        System.out.println(list.size());
        String apple = list.get(1);
        System.out.println(apple);
        List<Integer> list1 = List.of(1,55,66,88);
        List<String> list2 = List.of("a","b","c","d");
        for(int i = 0; i < list2.size(); i++) {
            String s = list2.get(i);
            System.out.println(s);
        }
        for(Iterator<String> it = list2.iterator(); it.hasNext();) {
            String q = it.next();
            System.out.println(q);
        }
        Integer [] array = list1.toArray(new Integer[list1.size()]);
        for (Integer i : array) {
            System.out.println(i);
        }
        String[] array1 = {"1","2","3"};
        List<String> list3 = List.of(array1);
        for (String n : array1) {
            System.out.println(n);
        }

        Map<String, String> map = new HashMap< >();
        map.put("a", new String("zhang"));
        map.put("b", new String("wang"));
        System.out.println(map.get("a"));
        System.out.println(map.get("c"));

        List<String> list4 = new ArrayList<>();
        list4.add("qqq");
        list4.add("aaa");
        list4.add("sss");
        System.out.println(list4);
        Collections.sort(list4);
        System.out.println(list4);

        List<Integer> list5 = new ArrayList<>();
        for (int i = 0 ; i < 10 ; i++) {
            list5.add(i);
        }
        System.out.println(list5);
        Collections.shuffle(list5);
        System.out.println(list5);

        String text =
                "A panda walks into a cafe. He orders a sandwich, eats it, then " +
                        "draws a gun and fires two shots in the air." +
                        "\"Why?\" asks the confused waiter, as the panda makes towards the exit." +
                        "The panda produces a badly punctuated wildlife manual and tosses it over" +
                        "his shoulder. \"I'm a panda,\" he says, at the door." +
                        "\"Look it up.\" The waiter turns to the relevant entry and, sure enough, " +
                        "finds an explanation..." +
                        "\"Panda. Large black-and-white bear-like mammal, native to China. Eats, " +
                        "shoots and leaves.\"";
        System.out.println(text);

        byte[] bs = toGBK("中中");
        System.out.println(Arrays.toString(bs));
    }

    static byte[] toGBK(String s) {
        try {
            return s.getBytes("GBK");
        }catch (UnsupportedEncodingException e) {
            System.out.println(e);
            return s.getBytes();
        }
    }
}




