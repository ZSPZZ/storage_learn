package 面向对象编程;

public class wrapper_class {
    public static void main(String[] args)
    {
        int i = 100;
        //编译器自动使用Interger.valueof(int),称为自动装箱:
        Integer n0 = 100;
        //把Integer变为int 自动装箱：
        int i0 = n0;
        //通过new操作符创建Integer实例(不推荐使用，会有编译警告):
        Integer n1 = new Integer(i);
        //通过静态方法value0f(int)创建Integer实例:
        Integer n2 = Integer.valueOf(i);
        //通过静态方法value0f(String)创建Integer实例:
        Integer n3 = Integer.valueOf("100");
        //创建新对象时，优先选用静态工厂方法(Integer.value0f())而不是new操作符。
    }
}
class wrapper_class_0{
    //进制转换
    public static void main(String[] args){
        int x1 = Integer.parseInt("100");//100
        int x2 = Integer.parseInt("100", 16);//256,把100按十六进制解析
        //把整数格式化为指定进制的字符串:
        System.out.println(Integer.toString(100));//十进制
        System.out.println(Integer.toString(100, 8));//144，八进制
        System.out.println(Integer.toHexString(100));//144，八进制
        System.out.println(Integer.toOctalString(100));//64，十六进制
        System.out.println(Integer.toBinaryString(100));//1100100，二进制
    }
}
class wc_others{
    //others
    public static void main(String[] args){
        //包装类定义的 静态变量
        //boolean
        Boolean t = Boolean.TRUE;
        Boolean f = Boolean.FALSE;
        //int
        int max = Integer.MAX_VALUE;//2147483647
        int min = Integer.MIN_VALUE;//-2147483648
        //long
        //long类型占用的bit和byte数量:
        int size0fLong = Long.SIZE;// 64(bits)
        int bytes0fLong = Long.BYTES;// 8(bytes)

        Number num = new Integer(999);
        //获取byte, int, long, float, double;
        byte b = num.byteValue();
        int n = num.intValue();
        long ln = num.longValue();
        //float
        //double
    }
}
