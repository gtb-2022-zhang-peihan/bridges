public class UsualTools {
    public static void main(String[] args) {
        System.out.println(Math.abs(-5));
        System.out.println(Math.max(89,97));
        System.out.println(Math.min(67,988));
        System.out.println(Math.pow(2,5));
        System.out.println(Math.sqrt(2));
        System.out.println(Math.exp(3));
        System.out.println(Math.log(Math.E));
        System.out.println(Math.log10(100));
        System.out.println(Math.PI);
        System.out.println(Math.random());
        //实现区间内的随机整数
        double x = Math.random();
        double min = 10;
        double max = 50;
        double y = x * (max - min) + min;
        long n = (long) y;
        System.out.println(y);
        System.out.println(n);

    }
}
