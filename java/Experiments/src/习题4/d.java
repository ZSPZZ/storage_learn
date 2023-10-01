package 习题4;

import java.math.*;

public class d {
    public static void main(String[] args){
        int sum = 0;
        boolean flag;
        for(int i = 2; i <= 100; i++){
            flag = true;
            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
