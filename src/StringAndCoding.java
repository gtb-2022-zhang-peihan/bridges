import java.util.Arrays;

public class StringAndCoding {
    public static void main(String[] args) {
        String q1 = "Hello!";
        String q2 = new String(new char[] {'H','e','l','l','o','!'});
        System.out.println(q2);
        System.out.println("#####判断字符串相等#####");
        String q = "Hello";
        System.out.println(q);
        q = q.toUpperCase();
        System.out.println(q);
        String w = "HELLO";
        System.out.println(q == w);
        System.out.println(q.equals(w));//字符串比较必须用.equal() 若需要忽略大小写 .equalIgnoreCase()
        //搜索字串
        System.out.println("#####搜索字符#####");
        System.out.println("Hello".contains("ll"));
        System.out.println("hello".indexOf("l"));//字符串值在字符串中首次出现的位置
        System.out.println("hello".lastIndexOf("ello"));//最后一次出现的位置
        System.out.println("hello".startsWith("he"));
        System.out.println("hhllle".endsWith("le"));
        System.out.println("khjhjhj".substring(0,5));
        //去除首尾空白字符
        System.out.println("####去除首尾空白字符#####");
        System.out.println("\thello\r\n".trim());//.trim去除首尾空白字符
        System.out.println("\u3000hello\u3000".strip());
        System.out.println("".isEmpty());
        System.out.println(" ".isEmpty());
        System.out.println("\n ".isBlank());
        System.out.println("gg".isBlank());
        //替换字符
        System.out.println("#####替换字符#####");
        String e = "allen,zph";
        System.out.println(e.replace('a','A'));
        System.out.println(e.replace("ll","LL"));
        //分割字符串
        System.out.println("####分割字符串####");
        String[] ee = e.split("\\,");
        System.out.println(ee[0]);
        //拼接字符串
        String[] qwe = {"A","B","C"};
        String r = String.join("***",qwe);
        System.out.println(r);
        //格式化字符串
        String t = "Hi %s, your score is %d!";
        System.out.println(t.formatted("Allen",85));
        System.out.println(String.format("Hi %s, your score is %.1f", "Allen",85.5));
        //类型转换
        String.valueOf(123);
        String.valueOf(new Object());
        System.out.println(new Object());
        int n1 = Integer.parseInt("123");
        int n2 = Integer.parseInt("ff",16);
        System.out.println(n1);
        System.out.println(n2);
        boolean b1 = Boolean.parseBoolean("true");
        System.out.println(b1);
        char[] cs = "Hello".toCharArray();
        String qw = new String(cs);
        System.out.println(qw);
        cs[0] = 'X';
        System.out.println(qw);
        //Score
        int[] scores = new int[] {88,77,51,66};
        Score s = new Score(scores);
        s.printScores();
        scores[2] = 99;
        s.printScores();
        System.out.println(Arrays.toString(scores));
        String aaa = "abcdefg";
        String bbb = new StringBuilder(aaa).reverse().toString();
        System.out.println(bbb);
    }
}
class Score {
    private int[] scores;
    public  Score(int[] scores) {
        //this.scores = scores;
        this.scores = Arrays.copyOf(scores, scores.length);
    }

    public void printScores() {
        System.out.println(Arrays.toString(scores));
    }
}