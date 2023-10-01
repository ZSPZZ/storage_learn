package 面向对象编程;

import java.util.StringJoiner;


public class StrJoiner {
    //类似python中的.join
    public static void main(String[] args){
        String[] names = {"Bob", "Alice", "Grace"};

        //构建一个StringJoiner类的对象sj
        //StringJoiner sj = new StringJoiner(",", "开头{", "}结尾");
        var sj = new StringJoiner(",", "开头{", "}结尾");
        for (String name : names){
            sj.add(name);
        }
        System.out.println(sj.toString());
    }
}
class StrJoiner_0{
    //String.join()
    public static void main(String[] args){
        String[] names = {"Bob", "Alice", "Grace"};
        var s = String.join(",", names);
        System.out.println(s.toString());
    }
}
