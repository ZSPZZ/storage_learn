package IO;

import java.io.*;
public class InputStream_ {
    public static void main(String[] args) throws IOException {
        InputStream input = new FileInputStream("src/readme.txt");
        for (;;) {
            int n = input.read(); // 反复调用read()方法，直到返回-1
            if (n == -1) {
                break;
            }
            System.out.println(n); // 打印byte的值
        }
        input.close(); // 关闭流
    }
}
