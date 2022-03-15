public class Count {
    public static void main(String[] args){
        int i = 156 + 56;
        int q = 45 * 45;
        int w = (45 + 6) / 3;
        int e = (89 + 56) % 9;
        int r = (89 + 56) / 9;
        System.out.println(i);
        System.out.println(q);
        System.out.println(w);
        System.out.println(e);
        System.out.println(r);
        //浮点
        double x = 1.0 / 10;
        double y = 1 - 9.0 / 10;
        System.out.println(x);
        System.out.println(y);
        int qw = 5;
        double we = 1.2 +24.0 / qw;// 参与运算的两个数其中一个是整形的话，整形会自动提升为浮点型
        System.out.println(we);
        double a1 = 1.0;
        double a2 = 3.0;
        double a3 = - 4.0;
        double a4 = Math.sqrt(a2 * a2 - 4 * a1 * a3);
        double r1 = (- a2 + a4) / (2 * a1);
        double r2 = (- a2 - a4) / (2 * a1);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r1 == 1 && r2 == -4 ? "测试通过":"测试失败");
        // 布尔运算
        boolean b = 5 < 3;
        boolean result = b && (5 / 0 > 0);
        System.out.println(result);//短路运算机制
        boolean result1 = true || (5 / 0 > 0);
        System.out.println(result1);
        int age = 7;
        boolean isPrimarystudent = age >= 6 && age <= 12;
        System.out.println(isPrimarystudent ? "Yes" : "No");
        //字符与字符串 char字符 String字符串
        int myage =25;
        String s = "my age is " + myage;
        System.out.println(s);
        String s1 = """
                    My name is zhangpeihan
                    I'm from Xi'an""";
        System.out.println(s1);
        String s2 = "hello";
        String t2 = s2;
        s2 = "world";
        System.out.println(t2);
        int z1 = 78;
        int z2 = 45;
        int z3 = 54654;
        int z = z1+z2+z3;
        System.out.println(z);
        //数组类型
        int [] ns = new int[5];
        ns[0] = 56;
        ns[1] = 45;
        ns[2] = 12;
        ns[3] = 567;
        ns[4] = 44;
        System.out.println(ns[4]);
        int [] na = { 89, 32, 12, 43, 56};
        System.out.println(na[1]);
        String[] abc = {"qwe", "rty", "uio"};
        String qwer = abc[1];
        abc[1] = "dog";
        System.out.println(qwer);
        System.out.println(abc[1]);
        char a = '\u042A';
        System.out.println(a);
        double aaa = 2.75;
        System.out.println(aaa);
        int xx = 2147483647;
        xx *= 2;
        System.out.println(xx);
        int integer = 1;
        int sin = -1;
        int cos = integer ^ sin;
        System.out.println(123456^-1);

    }
}
