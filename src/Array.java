import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] ns = {1,58,6,23,78,60,23,99};
        for (int i=0; i<ns.length-1; i++) {
            for (int j=0; j<ns.length-i-1; j++) {
                if (ns[j] > ns[j+1]) {
                    int tmp = ns[j];
                    ns[j] = ns[j+1];
                    ns[j+1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(ns));
        Arrays.sort(ns);
        System.out.println(Arrays.toString(ns));
        int[] na = {12,3,89,53,42,78,3,96,45,86};
        for (int i=0; i<na.length-1; i++) {
            for (int j=0; j<na.length-i-1; j++) {
                if (na[j] < na[j+1]) {
                    int tmp = na[j];
                    na[j] = na[j+1];
                    na[j+1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(na));
        //多维数组
        int[][] nb = {
                {1,2,3,4},
                {2,3,4,5},
                {3,4,5,6}
        };
        System.out.println(nb.length);
        int newArray[] = new int[1];
        newArray = Arrays.copyOf(na,11);
        newArray[10] = 1;
        System.out.println(Arrays.toString(newArray));
        int[] originalArray = {1, 2, 3, 4, 5};
        int qqqq[] = new int[10];
        qqqq = Arrays.copyOf(originalArray,10);
        Arrays.fill(qqqq,5,9,0);
        System.out.println(Arrays.toString(qqqq));
    }
}
