package 日期与时间;

import java.text.*;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
import java.util.*;
public class Calender_ {
    // Calendar可以用于获取并设置年、月、日、时、分、秒
    // 相较Date多了一个可以做简单的日期和时间运算的功能.
    public static void main(String[] args) {
        // 获取当前时间:
        Calendar c = Calendar.getInstance();
        // **********
        int y = c.get(Calendar.YEAR);
        int m = 1+c.get(Calendar.MONTH);
        int d = c.get(Calendar.DAY_OF_MONTH);
        int w = c.get(Calendar.DAY_OF_WEEK);// 从1=星期天 到 7=星期六
        int hh = c.get(Calendar.HOUR_OF_DAY);
        int mm = c.get(Calendar.MINUTE);
        int ss = c.get(Calendar.SECOND);
        int ms = c.get(Calendar.MILLISECOND);
        System.out.println(y + "-" + m + "-" + d + " " + w + " " + hh + ":" + mm + ":" + ss + "." + ms);

        // 设置特定日期时间
        // 清除所以：
        c.clear();
        // 设置2019年 9月 2日
        c.set(Calendar.YEAR, 2019);
        c.set(Calendar.MONTH, 8);// 索引8代表9月
        c.set(Calendar.DAY_OF_MONTH, 2);
        // 设置时间:
        c.set(Calendar.HOUR_OF_DAY, 21);
        c.set(Calendar.MINUTE, 22);
        c.set(Calendar.SECOND, 23);
        // 利用Calendar.getTime()可以将一个Calendar对象转换成Date对象
        // 然后就可以用SimpleDateFormat格式化
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(c.getTime()));
        // 2019-09-02 21:22:23
    }
}

class ugh{

}
