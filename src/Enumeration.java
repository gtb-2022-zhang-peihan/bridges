public class Enumeration {
    public static void main(String[] args) {
        Weekday day = Weekday.MON;
        if (day == Weekday.SAT || day == Weekday.SUN ){//enum作为引用类型可以使用==比较
            System.out.println("Work at home!");
        } else {
            System.out.println("Work at office!");
        }
            String s = Weekday.MON.name();
            int a = Weekday.WED.ordinal();
            System.out.println(s.toString());
            System.out.println(a);
            if (day.dayValue == 6 || day.dayValue == 0) {
            System.out.println("Today is " + day + ". Work at home!");
            }else {
                System.out.println("Today is " + day + ". Work at office");
            }

            //枚举在switch中的练习
        switch (day) {
            case MON:
            case TUE:
            case WED:
            case THU:
            case FRI:
                System.out.println("Today is " + day + ". Work at office!");
                break;
            case SAT:
            case SUN:
                System.out.println("Today is " + day + ". Work at home!");
                break;
            default:
                throw new RuntimeException("cannot process" + day);
        }
    }
}

enum Weekday {
    SUN(0, "星期天"), MON(1, "星期一"), TUE(2, "星期二"), WED(3, "星期三"), THU(4, "星期四"), FRI(5, "星期五"), SAT(6, "星期六");

    public final int dayValue;
    private final String chinese;

    private Weekday(int dayValue, String chinese) {
        this.dayValue = dayValue;
        this.chinese = chinese;
    }

    @Override
    public String toString() {
        return this.chinese;
    }
}