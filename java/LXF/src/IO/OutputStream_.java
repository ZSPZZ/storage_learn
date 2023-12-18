package IO;

import java.io.*;
public class OutputStream_ {
    // 签名 public abstract void write(int b) throws IOException;
    // 主要方法 write()
    // 可以调用flush()强制输出缓冲区
    public static void main(String[] args) throws IOException{
        OutputStream output = new FileOutputStream("out/readme.txt");
        output.write(72);
        output.write(101);
        output.write(108);
        output.write(108);
        output.write(111);
        // 写入 Hello
        output.close();
    }
}
