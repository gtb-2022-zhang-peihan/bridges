import java.util.*;

public class PhonenumberPractice {
        public static void main(String[] args) throws Exception {
            String re = "0\\d{2,3}\\-[1-9]\\d{6,7}";
            for (String s : List.of("010-12345678", "020-9999999", "0755-7654321")) {
                if (!s.matches(re)) {
                    System.out.println("测试失败: " + s);
                    return;
                }
            }
            for (String s : List.of("010 12345678", "A20-9999999", "0755-7654.321")) {
                if (s.matches(re)) {
                    System.out.println("测试失败: " + s);
                    return;
                }
            }
            System.out.println("测试成功!");
        }
}
