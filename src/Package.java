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
        Integer a1 = Integer.valueOf(i);
        Integer a2 = Integer.valueOf("100");
        System.out.println(a1.intValue());
        System.out.println(a2.intValue());
        //Auto boxing
        Integer q = 100;
        int r = q.intValue();
        int x = q;
        System.out.println(r);
    }
}

