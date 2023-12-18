package IO;

import java.io.*;
public class InputStream_1 {
    // 缓冲
    // 一次性读取多个字节到缓冲区
    // int read(byte[] b):读取若干字节并填充到byte[] 数组，返回读取的字节数
    // int read(byte[] b, int offn int len):指定byte[]数组的偏移量和最大填充数
    public static void main(String[] args) throws IOException {
        try (InputStream input = new FileInputStream("src/readme.txt")) {
            // 定义1000个字节大小的缓冲区
            byte[] buffer = new byte[1000];
            int n;
            while ((n = input.read(buffer)) != -1) {// 读取到缓冲区
                System.out.println("read" + n + "bytes.");
            }
            // 调用read()方法时，必须等read()方法返回后才能继续。
            // 因此无法确定read()方法调用到底要花多少时间
        }
    }
}
