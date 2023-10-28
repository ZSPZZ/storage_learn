package 集合;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class UseMap_ {
    public static void main(String[] args) {
        Student s = new Student("Xiao Ming", 99);
        Map<String, Student> map = new HashMap<>();
        map.put("Xiao Ming", s);// 将“Xiao Ming”和Student实例映射并关联
        Student target = map.get("Xiao Ming");// 通过key查找并返回映射的Student实例
        System.out.println(target == s);// true,同一个实例
        System.out.println(target.score);// 99
        Student another = map.get("Bob");// 通过另一个key查找
        System.out.println(another); //未找到返回null

        Map<String, Integer> amap = new HashMap<>();
        amap.put("a", 1);
        amap.put("b", 2);
        amap.put("c", 3);
        for (String ch : amap.keySet()) {// 使用for each循环遍历Map实例的keySet()方法返回的Set集合
            Integer value = amap.get(ch);
            System.out.println(ch + "=" + value);
            /*
            a=1
            b=2
            c=3
            */
        }

        //同时遍历key和value可以使用for each循环遍历Map对象的entrySet()集合，它包含每一个key-value映射：
        for(Map.Entry<String, Integer> entry : amap.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "=" + value);
        }
    }
}

class Student {
    public String name;
    public int score;
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
    @Override
    public boolean equals(Object o) {
        if(o instanceof Student s) {
            return Objects.equals(s.name, this.name) && s.score == this.score;
        }
        return false;
    }
}