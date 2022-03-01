public class StringBuild {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder(1024);//1024代表容量？？
        for (int i = 10; i < 100; i++) {
            s.append(',');
            s.append(i);
        }
        System.out.println(s);
        var sb = new StringBuilder(1024);
        sb.append("Mr ")
                .append("Bob")
                .append("!")
                .insert(0,"Hello,");
        System.out.println(sb.toString());
        Adder qwer = new Adder();
        qwer.add(3)
                .add(5)
                .inc()
                .add(10);
        System.out.println(qwer.value());

        String[] fields = {"name","position","salary"};
        String table = "employee";
        String insert = buildInsertSql(table,fields);
        String a = "INSERT INTO employee (name,position,salary) VALUES (?,?,?)";
        System.out.println(a.equals(insert));
    }
    static String buildInsertSql(String table, String[] fields){
        StringBuilder sb = new StringBuilder(1024);
        sb.append("INSERT INTO ")
                .append(table)
                .append(" (");
        String s = String.join(",",fields);
        String[] a1 = new String[fields.length];
        for (int i = 0; i < fields.length; i++){
            a1[i] = "?";
        }
        String s2 = String.join(",",a1);
        sb.append(s)
                .append(") ")
                .append("VALUES (")
                .append(s2)
                .append(")");
        return sb.toString();
    }

}

class Adder {
    private  int sum = 0;

    public Adder add (int n) {
        sum += n;
        return this;
    }

    public Adder inc() {
        sum ++;
        return this;
    }

    public int value() {
        return sum;
    }
}
