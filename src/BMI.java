import java.util.Scanner;

public class BMI {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your weight:");
        double weight = scanner.nextInt();
        System.out.print("Input your height:");
        double height = scanner.nextDouble();
        double bmi = weight / (height * height);
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
    }
}
