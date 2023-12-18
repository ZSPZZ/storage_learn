package IO;

import java.io.*;

public class OutputStream_1 {
    public static void main(String[] args) throws IOException {
        OutputStream output = new FileOutputStream("out/readme.txt");
        // 一次性写入若干字节
        output.write("Hello".getBytes("UTF-8")); //Hello
        output.close();

        // 保证无论发生IO错误时都能正确关闭流
        try (OutputStream output_ = new FileOutputStream("out/readme.txt")) {
            output_.write("Hello".getBytes("UTF-8"));
        }// 编译器在此自动为我们写入finally并调用close()
    }
}
