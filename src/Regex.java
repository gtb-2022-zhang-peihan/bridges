public class Regex {
    public static void main(String[] args) {
        String s = "20\\d\\d";
        System.out.println("2019".matches(s));
        System.out.println("2312".matches(s));
        //simple rule of matching
        String s1 = "allen\\@stu.xjtu.edu.cn";
        System.out.println("allen@stu.xjtu.edu.cn".matches(s1));
        String s2 = "a\u548cc";
        System.out.println("a和c".matches(s2));//用String.equals()也能做到
        String s3 = "a.c";
        System.out.println("aBc".matches(s3));
        System.out.println("a@c".matches(s3));
        //匹配数字用\d，匹配字母数字或下划线用\w
        String s4 = "s\\w";
        System.out.println("sa".matches(s4));
        System.out.println("s_".matches(s4));
        String s5 = "s\\sa";
        System.out.println("s a".matches(s5));
        System.out.println("s   a".matches(s5));//tab用\t
        //匹配非此范围的可以用大写代替
        //repeat matching
        String s6 = "a\\d*";//匹配任意字符 0-infinity
        System.out.println("a35555".matches(s6));
        System.out.println("a".matches(s6));
        String s7 = "a\\d+";//至少一个字符
        System.out.println("a12".matches(s7));
        System.out.println("a".matches(s7));
        String s8 = "a\\d?";//0或1个字符
        System.out.println("a2".matches(s8));
        System.out.println("a".matches(s8));
        String s9 = "a\\d{3}";//匹配指定n个字符
        System.out.println("a222".matches(s9));
        String s10 = "a\\d{3,4}";//匹配指定n-m个字符
        System.out.println("a222".matches(s10));
        System.out.println("a2121".matches(s10));
    }
}
