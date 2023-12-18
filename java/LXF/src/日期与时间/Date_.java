package 日期与时间;

import java.text.*;
import java.util.*;
import java.util.Date;
public class Date_ {
    // Date对象有几个问题:
    // 1.不能转换时区
    // 2.难对时间和日期进行加减
    // 3.计算两个日期相差多少天
    // 4.计算某个月第一个星期一的日期等
    public static void main(String[] args) {
        int x = 128000;
        // 输出是数据转换为字符串的结果
        // String toDisplay(int n) { ... }
        System.out.println(Integer.toHexString(x));
        System.out.println(NumberFormat.getCurrencyInstance(Locale.US).format(x));
        System.out.println(System.currentTimeMillis());

        Date date = new Date();
        System.out.println(date.getYear() + 1900);// 必须加1900
        System.out.println(date.getMonth() + 1);// 0~11,必须加上1
        System.out.println(date.getDate());// 1~31, 不能加1
        // 转换为String:
        System.out.println(date.toString());
        // 转换为GMT时区:
        System.out.println(date.toGMTString());
        // 转换为本地时区:
        System.out.println(date.toLocaleString());

        // 日期自定义格式输出:
        var sdf = new SimpleDateFormat("yyyy-MMM-MMMM-dd HH:mm:ss");
        System.out.println(sdf.format(date));
    }
}
