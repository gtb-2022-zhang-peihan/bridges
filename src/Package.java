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
    }
}

