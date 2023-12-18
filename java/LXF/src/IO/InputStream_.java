package IO;

import java.io.*;
public class InputStream_ {
    public static void main(String[] args) throws IOException {
        InputStream input = null;
        try {
            input = new FileInputStream("src/readme.txt");
            int n;
            while ((n = input.read()) != -1) {// 利用while同时读取并判断
                System.out.println(n); // 打印byte的值
            }
        } finally {
            if (input != null) {
                input.close(); // 关闭流
            }
        }

        // try(resource)语法
        try (InputStream input_ = new FileInputStream("src/readme.txt")) {
            int n;
            while ((n = input.read()) != -1) {
                System.out.println(n);
            }
        }// 编译器在此自动为我们写入finally并调用close()
    }
}
