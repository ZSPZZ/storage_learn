package IO;

import java.io.*;
import java.util.zip.GZIPInputStream;

public class filter_ {
    // filter模式(或称装饰器模式：Decorator)
    // 通过少量的类来实现各种功能的组合
    public static void main(String[] args) throws IOException{
        InputStream file = new FileInputStream("text.gz");// 直接提供数据的基础InputStream
        // 叠加提供额外附加功能的InputStream
        InputStream buffered = new BufferedInputStream(file);// 包装一个BufferInputStream
        InputStream gzip = new GZIPInputStream(buffered);// 包装一个GZIPInputStream
    }
}
