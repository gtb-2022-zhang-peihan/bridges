public class Package {
    public static void main(String[] args){
        Integar n = null;
        Integar n2 = new Integar(99);
        int n3 = n2.intValue();
        /*java自带的包装类型
        boolean java.lang.Boolean
        byte    java.lang.Byte
        short   java.lang.Short
        int     java.lang.Integar
        long    java.lang.Long
        float   java.lang.Float
        double  java.lang.Double
        char    java.lang.Character
         */
        int i = 100;
        Integer a1 = Integer.valueOf(i);//
        Integer a2 = Integer.valueOf("100");
        System.out.println(a1.intValue());
        System.out.println(a2.intValue());
        //Auto boxing
        Integer q = 100;
        int r = q.intValue();
        int x = q;
        System.out.println(r);
        //不变类 所有的包装类型都是不变类 进行比较时要有equal()而不是==
        Integer q1 = 99;
        Integer q2 = 99;
        Integer q3 = 123465;
        Integer q4 = 123465;
        System.out.println("q1 == q2: " + (q1==q2));
        System.out.println("q3 == q4: " + (q3==q4));//数值较小时系统会自动将 Integar x = 99 变为 Integar x = integar.Valueof(99),实际应用中不要用这种方法
        System.out.println("q1.equal(q2): " + q1.equals(q2));
        System.out.println("q3.equal(q4): " + q3.equals(q4));
        //creat new example of Integar
        Integar s1 = new Integar(588);
        Integer s2 = Integer.valueOf(545);
        System.out.println(s1.intValue());
        System.out.println(s2.intValue());
        //switch of system scale 进制转换
        int x1 = Integer.parseInt("100");
        int x2 = Integer.parseInt("100", 16);
        System.out.println(x1);
        System.out.println(x2);//字符串转变为整数
        int x3 = 100;
        System.out.println(Integer.toString(x3));
        System.out.println(Integer.toString(x3,16));
        System.out.println(Integer.toBinaryString(x3));//将整数格式化转变为指定进制的字符串


    }
}

