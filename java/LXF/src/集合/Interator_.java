package 集合;

import java.util.*;
public class Interator_ {
    // 迭代器
    public static void main(String[] args) {
        List<String> list = List.of("apple", "banana", "orange");
        for (String s : list) {
            System.out.println(s);
        }
        //相等于
        //通过Iterator对象遍历集合的模式称为迭代器
        for (Iterator<String> it = list.iterator(); it.hasNext(); ) {
            String s = it.next();
            System.out.println(s);
        }
    }
}

