package 集合;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

// 关于配置
public class Properties_ {
    // 从内存读取一个字节流
    public static void main(String[] args) throws IOException {
        String settings = """
                # test
                course=Java
                last_open_date=2023-10-24T19:01:01""";
        ByteArrayInputStream input = new ByteArrayInputStream(settings.getBytes(StandardCharsets.UTF_8));
        Properties props = new Properties();// 创建 Properties 实例
        props.load(input);// 调用 load() 读取文件

        System.out.println("course: " + props.getProperty("course"));// 调用 getProperty() 获取配置
        System.out.println("last_open_date: " + props.getProperty("last_open_date"));
        System.out.println("last_open_file: " + props.getProperty("last_open_file"));// 没有此配置，返回 null
        System.out.println("auto_save: " + props.getProperty("auto_save", "60"));// 设置默认值60
    }
}
