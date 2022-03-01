import java.util.Locale;

public class ProcessControl {
    public static void main(String[] args){
        //输入与输出
        System.out.print("A,");
        System.out.print("B,");
        System.out.print("C.");
        System.out.println();
        System.out.println("END");
        double d = 3.1415926;
        double a = 1.262686;
        System.out.printf("%.2f\n",d);
        System.out.printf("%.4f\n",a);
        int n = 12345600;
        int b = 23560000;
        System.out.printf("n=%d, hex=%08x\n",b,n);
        //if
        int grade = 90;
        if (grade >= 90) {
            System.out.println("优秀");
        }else if (grade >= 75){
            System.out.println("良好");
        }else if (grade >= 60){
            System.out.println("及格");
        }else{
            System.out.println("不及格");
        }
        System.out.println("END");
        double x = 1 - 9.0 / 10.0;
        if (Math.abs(x - 0.1) < 0.00000001){
            System.out.println("x is 0.1");
        }else{
            System.out.println("x isn't 0.1");
        }
        String s1 = "hello";
        String s2 = "HELLO".toLowerCase();
        System.out.println(s1);
        System.out.println(s2);
        if (s1 == s2) {
            System.out.println("s1 = s2");
        }else{
            System.out.println("s1 != s2");
        }
        if (s1.equals(s2)){
            System.out.println("s1 equals s2");
        }else{
            System.out.println("s1 not equals s2");
        }
        double weight = 55;
        double height = 1.75;
        double bmi = (weight / (height * height));
        if ((bmi - 32) > 0.00001) {
            System.out.println("非常肥胖");
        }else if ((bmi - 28) > 0.00001){
            System.out.println("肥胖");
        }else if ((bmi - 25) > 0.00001){
            System.out.println("体重过重");
        }else if ((bmi - 18.5) > 0.00001){
            System.out.println("体重正常");
        }else{
            System.out.println("体重过低");
        }
        System.out.println(bmi);
        //switch 多重选择
        int option = 4;
        switch (option) {
            case 1:
                System.out.println("Selected 1");
                break;
            case 2:
                System.out.println("Selected 2");
                break;
            case 3:
                System.out.println("Selected 3");
                break;
            default:
                System.out.println("Not selected");
                break;
        }
        String fruit = "apple";
        switch (fruit) {
            case "apple":
                System.out.println("Selected apple");
                break;
            case "banana":
                System.out.println("Selected banana");
                break;
        }
        String brand = "nokia";
        switch (brand) {
            case "huawei" -> System.out.println("Selected huawei");
            case "nokia" -> System.out.println("Selected nokia");
            case "vivo" -> {
                System.out.println("Selected vivo");
                System.out.println("It sucks!");
            }
            default -> System.out.println("No brand selected");
        }
        int opt = switch (brand) {
            case "hauwei" -> 1;
            case "vivo" -> 2;
            default -> {
                int code = 199768;
                yield code;
            }
        };//赋值要以分号结尾
        System.out.println("opt = " + opt);
        //while循环 先判断条件再执行
        int sum = 0;
        int number = 1;
        while (number <= 100) {
            sum = sum + number;
            number ++;
        }
        //do while 先执行一次在判断条件
        System.out.println(number);
        System.out.println(sum);//注意边界条件
        int sum1 = 0;
        int k = 20;
        int l = 100;
        do {
            sum1 = sum1 + k;
            k ++;
        } while (k <= l);
        System.out.println(sum1);
        //for循环
        int[] ns = {45,56,98,63,78};
        int sum2 = 0;
        for (int i=0; i<ns.length; i++) {
            System.out.println("i = "+i+", ns[i] ="+ns[i]);
            sum2 = sum2 + ns[i];
        }
        System.out.println(sum2);//计数器i不要放到循环体内，尽量定义在for循环内
        int [] na = {1,4,9,16,25};
        for (int o=4; o>=0; o--) {
            System.out.println("o = "+o+", na[o] ="+na[o]);
        }
        int [] nd = {1,4,9,16,25};
        int sum3 = 0;
        for (int t : nd) {
            sum3 = sum3 +t;
        }
        System.out.println(sum3);
        double pi = 0;
        double f = 0;
        int m = 1;
        for (int p=1;p>0;p=p+2,m*=-1) {
            f = m * 1.0/p;
            pi = pi + f;
        }
        System.out.println(4*pi);
        //break continue

    }
}

