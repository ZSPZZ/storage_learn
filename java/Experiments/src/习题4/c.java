package 习题4;

import java.util.ArrayList;
import java.util.List;
import java.math.*;

public class c {

    public static void main(String[] args){
        boolean flag = true;
        List<Integer> js = new ArrayList<>();
        List<Integer> ss = new ArrayList<>();
        for(int i = 1; i <= 50; i++){
            if(i % 2 == 1){
                js.add(i);
            }
            for(int j = 2; j <= Math.sqrt(i); j++){
                flag = true;
                if(i % j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                ss.add(i);
            }
        }
        ss.remove(0);
        System.out.println(js.toString());
        System.out.println(ss.toString());
    }
}
