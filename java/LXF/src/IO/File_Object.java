package IO;

import java.io.*;
public class File_Object {
    // java.io提供了File对象操作文件和目录
    public static void main(String[] args) {
        // 构造File对象时，既可以传入绝对路径，也可以传入相对路径。
        // 绝对路径是以根目录开头的完整路径 ↓↓↓
        File f = new File("C:\\Users\\21549\\Desktop\\11.txt");
        System.out.println(f);

        // 传入相对路径时，相对路径前面加上当前目录就是绝对路径
        // 用.表示当前目录,用..表示上级目录
        File f1 = new File("sub\\javac");// 绝对路径是C:\Docs\sub\javac
        File f2 = new File(".\\sub\\javac");// 绝对路径是C:\Docs\sub\javac
        File f3 = new File("..\\sub\\javac");// 绝对路径是C:\sub\javac
        // 构造File对象时，不会导致任何磁盘操作，调用此对象方法时，才真正进行磁盘操作
    }
}
