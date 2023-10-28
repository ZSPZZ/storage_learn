package 集合;

import java.util.*;
public class Set_1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();// 创建TreeSet时和创建TreeMap操作相同
        set.add("apple");
        set.add("banana");
        set.add("pear");
        set.add("pear");
        set.add("orange");
        for (String s : set) {
            System.out.println(s);
        }
    }
}
