package 集合;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class initList_ {
    public static void main(String[] args) {
        List<String> list = List.of("apple", "banana", "pear");
        for (String s : list){
            System.out.println(s);
        }
        for (Iterator<String> itlist = list.iterator(); itlist.hasNext(); ){
            String s = itlist.next();
            System.out.println(s);
        }
    }
}
