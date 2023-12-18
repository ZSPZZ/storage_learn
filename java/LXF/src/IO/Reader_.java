package IO;

import java.io.FileReader;
import java.io.Reader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
// InputStream可以通过new InputStreamReader(...)转换为Reader

public class Reader_ {
    // reader是字符流，以char为单位读取
    //以下演示如何完整读取一个FileReader的所有字符
    public static void main(String[] args) throws IOException {
        // 创建一个FileReader对象
        try (Reader reader = new FileReader("src/readme.txt", StandardCharsets.UTF_8)) {//  字符编码是???
            for (; ; ) {
                int n = reader.read();// 反复调用read()方法，直到返回-1
                if (n == -1) {
                    break;
                }

                System.out.println((char) n);// 打印char
            }
            reader.close();
        }

        // 利用缓存
        try (Reader re = new FileReader("src/name.txt", StandardCharsets.UTF_8)) {
            char[] buffer = new char[1000];
            int n;
            while ((n = re.read(buffer)) != -1) {
                System.out.println("read" + n + "chars.");
            }
        }
    }
}
