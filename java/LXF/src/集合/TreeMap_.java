package 集合;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
public class TreeMap_ {
    public static void main(String[] args) {
        Map<Key_, Integer> map = new TreeMap<>(new Comparator<Key_>() {
            // 传入自定义对象时，此对象必须实现Comparable接口，如果没有实现Comparable接口，那么创建TreeMap时必须传入一个Comparator对象
            // 传入String Integer等等时，他们已经实现Comparable接口，不需要再创建Comparator对象
            @Override
            // 创建TreeMap时同时指定一个自定义排序算法
            // 比较传入的两个元素，a<b返回负数， == 返回0
            // TreeMap 内部根据比较结果对Key进行排序
            public int compare(Key_ o1, Key_ o2) {
                return o1.key.compareTo(o2.key);
            }
        });// 使用TreeMap时，放入的Key必须依据实现 Comparable 接口,value没有任何要求
        map.put(new Key_("b", 1), 1);
        map.put(new Key_("3", 2), 3);
        map.put(new Key_("a", 3), 2);

        for (Key_ key : map.keySet()) {
            System.out.println(key);
        }
    }
}

class Key_{
    String key;
    int number;

    public Key_(String key, int number){
        this.key = key;
        this.number = number;
    }

    @Override
    public String toString() {
        return "{Key_: " + key + "}";
    }
}
