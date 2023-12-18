package IO;

import java.io.Serializable;
import  java.io.*;
import java.util.Arrays;
public class Serializable_1 {
    // 反序列化
    /*public static void main(String[] args) throws IOException{

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutputStream output = new ObjectOutputStream(); // 将class转换为字节流
            // 写入int
            output.writeInt(12345);
            // 写入String
            output.writeUTF("Hello");
            // 写入Object
            output.writeObject(Double.valueOf(123.456));

        ByteArrayInputStream buffers = new ByteArrayInputStream(output);
        try (ObjectInputStream input = new ObjectInputStream(buffers)) {// 从一个字节流读取Java对象
            int n = input.readInt();
            String s = input.readUTF();
            Double d = (Double) input.readObject();//返回Object对象，需要强制转型
        }
    }*/
}

class Person implements Serializable{
    int n;

    public Person(int n) {
        this.n = n;
    }
}
