package 日期与时间;
import java.time.*;
import java.time.format.*;

public class _LocalDateTime {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();// 当前日期
        LocalTime t = LocalTime.now();// 当前日期
        LocalDateTime dt = LocalDateTime.now();// 当前日期和时间

        System.out.println(d);// 严格按照ISO 8601格式打印
        System.out.println(t);// 严格按照ISO 8601格式打印
        System.out.println(dt);// 严格按照ISO 8601格式打印

        // 保证获取到同一时刻的日期和时间
        LocalDate d1 = dt.toLocalDate();
        LocalTime t1 = dt.toLocalTime();

        // 指定的日期和时间创建LocalDateTime
        LocalDate d2 = LocalDate.of(2019, 11, 30);
        LocalTime t2 = LocalTime.of(15, 16, 17);
        LocalDateTime dt2 = LocalDateTime.of(2019, 11, 30, 15, 16, 17);
        LocalDateTime dt3 = LocalDateTime.of(d2, t2);

        // 通过标准格式传入
        LocalDateTime dt4 = LocalDateTime.parse("2019-11-19T15:16:17");

        // Formatter自定义输出的格式
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(dtf.format(dt));
        LocalDateTime dt5 = LocalDateTime.parse("2019/11/30 15:16:17", dtf);

        // 调整时间
        dt2 = dt.plusDays(4).minusHours(5).plusWeeks(1);
        dt3 = dt.withDayOfMonth(31);
        dt3 = dt.withMonth(2);

    }
}
