package IO;

import java.io.File;
import java.io.IOException;

public class Fileee {
    public static void main(String[] args) throws IOException {
        File f = new File("F:\\practice\\Documents");
        System.out.println(f.getName() + "/");
        listDir(f);
    }
    static int depth = 1;
    static void listDir(File dir) {
        File [] fs = dir.listFiles();
        String blank = "\t";
        String blank1 = blank.repeat(depth);
        if (fs != null) {
            for (File f : fs) {
                if(f.isDirectory()){
                    System.out.println(blank1+ f.getName());
                    depth++;
                    listDir(f);
                    depth--;
                }else{
                    System.out.println(blank1 + f.getName());
                }
            }
        }
    }
}
