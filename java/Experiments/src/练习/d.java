package 练习;

import java.io.*;

public class d {
    static int i = 1;
    static int depth = 0;
    public static final String SPACE = " ";
    public static void main(String[] args) throws IOException {
        File f = new File("E:\\steam\\steamapps\\common\\ARK\\ShooterGame\\Saved");

        list_Files(f);

    }

    static void list_Files (File F) {
        File[] file = F.listFiles();
        if (file != null) {
            for (File f : file) {
                //显示目录层次所需空格
                StringBuilder sb = new StringBuilder();
                for(int j = 0; j < depth * 4; j++) {
                    sb.append(SPACE);
                }
                String prefix = sb.toString();
                if (f.isFile()) {
                    System.out.print(prefix);
                    System.out.printf("%d.%s\n", i, f.getName());
                    i++;
                } else if (f.isDirectory()) {
                    depth++;
                    System.out.println(prefix + f.getName() + "/");
                    list_Files(f);
                    depth--;
                }
            }
        } else {
            System.out.println("空文件夹");
        }
    }
}
