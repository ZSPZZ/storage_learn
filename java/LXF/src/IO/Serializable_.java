package IO;

import java.io.Serializable;
import  java.io.*;
import java.util.Arrays;
public class Serializable_ {
    // 序列化
    // 把一个java对变成二进制内容，本质上就是一个byte[]数组
    // 一个类只有实现了Serializeble接口，它的对象才能被序列化
    // ObjectOutputStream既可以写入基本类型，如int，boolean，也可以写入String(以UTF-8编码)
    // 还可以写入实现了Serializable接口的Object
    public static void main(String[] args) throws IOException{
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        try (ObjectOutputStream output = new ObjectOutputStream(buffer)) {// 将class转换为字节流
            // 写入int
            output.writeInt(12345);
            // 写入String
            output.writeUTF("Hello");
            // 写入Object
            output.writeObject(Double.valueOf(123.456));
        }
        System.out.println(Arrays.toString((buffer.toByteArray())));
    }
}
