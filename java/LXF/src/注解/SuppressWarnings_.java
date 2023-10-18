package 注解;

import java.util.ArrayList;
import java.util.List;

public class SuppressWarnings_ {
    //1.当我们不希望看到这些警告的时候，可以使用SuppressWarnings注解来抑制警告
    //2.在{""}中可以写入你希望抑制(不显示)警告信息
    //3.关于SuppressWarnings 作用范围是和你放置的位置相关 
    //@SuppressWarnings({"all"})
    @SuppressWarnings({"rawtypes", "unchecked", "unused"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("");
        list.add("");
        list.add("");
        int i;
        System.out.println(list.get(1));
    }
}

