package 集合;

import java.util.Properties;
import java.io.*;

public class Properties_1 {
    public static void main(String[] args) throws IOException {
        //read from classpath
        Properties prop1 = new Properties();
        prop1.load(prop1.getClass().getResourceAsStream("prop.properties"));
        String filepath = prop1.getProperty("last_open_file");
        String interval = prop1.getProperty("auto_save_interval");
        System.out.println(filepath + interval);
    }
}
