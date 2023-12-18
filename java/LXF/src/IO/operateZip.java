package IO;

import  java.io.*;
import java.nio.file.Files;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/*public class operateZip {
    public static void main(String[] args) throws IOException{
        // 读取zip包
        try (ZipInputStream zip = new ZipInputStream(new File(...))) {
            ZipEntry entry = null;// 一个ZipEntry表示一个压缩文件或目录
            while ((entry = zip.getNextEntry()) != null) {
                String name = entry.getName();// 读取文件名
                if (!entry.isDirectory()) {// 不是文件夹说明时压缩文件
                    int n;
                    while((n = zip.read()) != -1) {
                        ...
                    }
                }
            }
        }

        // 写入zip包
        try (ZipOutputStream ozip = new ZipOutputStream(new FileOutputStream(...))) {
            File[] files = ...;
            for (File file : files) {
                ozip.putNextEntry(new ZipEntry(file.getName()));
                ozip.write(Files.readAllBytes(file.toPath()));
                ozip.closeEntry();
            }
        }
    }
}*/
