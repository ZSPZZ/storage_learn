package 面向对象编程;

import java.math.*;
import java.util.HexFormat;

public class Ma_th {
    //随机
    public static void main(String[] args){
        double x = Math.random();//x 的范围是[0, 1)
        double min = 10;
        double max = 50;
        double y = x * (max - min) + min;//y的范围是[10, 50)
        long n = (long) y;
        System.out.println(y);
        System.out.println(n);
    }
}

class hex{
    public static void main(String[] args){
        byte[] data = "Hello".getBytes();
        HexFormat hf = HexFormat.of();
        String hexData = hf.formatHex(data);//48656c6c6f
    }
}
