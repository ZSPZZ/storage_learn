package 集合;

import java.util.*;
public class TreeMap_1 {
    public static void main(String[] args) {
        Map<Key_, Integer> map = new TreeMap<>(new Comparator<Key_>() {
            @Override
            public int compare(Key_ o1, Key_ o2) {
                return Integer.compare(o1.number, o2.number);
            }
        });
        map.put(new Key_("Tom", 77), 1);
        map.put(new Key_("Bob", 66), 2);
        map.put(new Key_("Lily", 99), 3);
        for(Key_ key : map.keySet()) {
            System.out.println(key);
        }
        System.out.println(map.get(new Key_("Bob", 66)));
    }
}
