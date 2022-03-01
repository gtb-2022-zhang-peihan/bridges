import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your name:");
        String name = scanner.nextLine();
        System.out.print("Input your age:");
        int age = scanner.nextInt();
        System.out.printf("Hi, %s, you are %d years old",name,age);
    }
}
