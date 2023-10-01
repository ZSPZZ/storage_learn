package 练习;
import java.util.*;
import  java.text.*;

public class Date_0 {
    public static void main(String[] args){
        /*//初始化Date对象
        Date date = new Date();

        //使用toString()函数显示日期时间
        System.out.println(date.toString());*/

        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("当前时间为：" + ft.format(dNow));
    }
}
