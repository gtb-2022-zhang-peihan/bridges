import java.util.List;
import java.util.regex.*;
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
        //complex rule of matching
        System.out.println("#####complex rule#####");
        String a = "3131sasfasd".replaceAll("\\d{2}", "Z");
        String b = "3131sasfasd".replaceAll("^\\d{2}", "Z");
        String c = "3131sdasfasd".replaceAll("sd", "Z");
        String d = "3131sdasfasd".replaceAll("sd$", "Z");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        String a1 = "[1-9][a-f]";
        System.out.println("2d".matches(a1));
        String a2 = "[0-9a-fA-F]{6}";
        System.out.println("1a2b3c".matches(a2));
        String a3 = "[^1-9]{3}";
        System.out.println("0AS".matches(a3));
        System.out.println("2A3".matches(a3));
        String a4 = "java|php";
        System.out.println("java".matches(a4));
        System.out.println("php".matches(a4));
        String a5 = "learn\\s([jJ]ava|[Pp]hp|(G|g)o)";
        System.out.println("learn Java".matches(a5));
        System.out.println("learn Java".matches(a5));
        System.out.println("learn php".matches(a5));
        System.out.println("learn Go".matches(a5));
        //分组匹配
        Pattern p = Pattern.compile("(\\d{3,4})\\-(\\d{7,8})");
        Matcher m = p.matcher("020-5558621");
        if (m.matches()) {
            String q1 = m.group(1);
            String q2 = m.group(2);
            System.out.println(q1);
            System.out.println(q2);
        }else {
            System.out.println("Matching False!");// 传入0会得到整个字串
        }
        Pattern t = Pattern.compile("([0-1]\\d|2[0-3])\\:([0-5]\\d)\\:([0-5]\\d)");
        Matcher time = t.matcher("23:01:59");
        if (time.matches()) {
            String hour = time.group(1);
            String min = time.group(2);
            String second = time.group(3);
            System.out.printf("%s时%s分%s秒\n",hour,min,second);
        } else {
            System.out.println("Wrong input!");
        }
        //非贪婪匹配
        Pattern c1 = Pattern.compile("(\\d+?)(0*)");
        Matcher c2 = c1.matcher("1230000");
        if (c2.matches()) {
            System.out.println("group1= " + c2.group(1));
            System.out.println("group2= " + c2.group(2));
        }
        //search and replace
        System.out.printf("%s%s%s\n","a b c".split("\\s")[0],"a b c".split("\\s")[1],"a b c".split("\\s")[2]);
        //search
        System.out.println("#####");
        String f3 = "the quick brown fox jumps over the lazy dog.";
        Pattern f4 = Pattern.compile("ox");
        Matcher f5 = f4.matcher(f3);
        while (f5.find()) {
            String sub = f3.substring(f5.start(), f5.end());
            System.out.println(sub);
        }
        //replace
        String f6 = "The     quick\t\t brown   fox  jumps   over the  lazy dog.";
        String f7 = f6.replaceAll("\\s+","\s");
        System.out.println(f6);
        System.out.println(f7);
        //反向引用
        String r1 = "the quick brown fox jumps over the lazy dog.";
        String r2 = r1.replaceAll("\\s([a-z]{4})\\s","\s#$1#\s");
        System.out.println(r2);
        String regex ="b\\w+t";
        String text = "the bat is the best";
        Pattern r =Pattern.compile(regex);
        Matcher rq = r.matcher(text);
        while (rq.find()) {
            String sub = text.substring(rq.start(), rq.end());
            System.out.println(sub);
        }
        System.out.println("a\sb");
        String originalString = "     The string with tailing space.";
        String modifiedString = originalString.stripLeading();
        System.out.println(modifiedString);
        int A = 'q';
        System.out.println(A);
    }
}
