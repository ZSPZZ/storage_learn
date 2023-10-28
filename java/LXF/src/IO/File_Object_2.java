package IO;

import java.io.*;
public class File_Object_2 {
    public static void main(String[] args) {
        File f = new File("C:\\Windows");
        File[] fs1 = f.listFiles();// 列出所有文件和子目录
        printFiles(fs1);
        File[] fs2 = f.listFiles(new FilenameFilter() {// 返回后缀exe的文件
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".exe");// 返回true表示接受该文件
            }
        });
        printFiles(fs2);
    }

    static void printFiles(File[] files) {
        System.out.println("========");
        if (files != null) {
            for (File f : files) {
                System.out.println(f);
            }
        }
        System.out.println("========");
    }
}
