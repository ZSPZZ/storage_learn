package 习题4;

import java.math.*;

public class e {
    public static void main(String[] args){
        int i = 1;
        int j = 1;
        int num = 3;
        while(i <= num){
            for(int n = 0; n < Math.abs((num-1)/2-i+1); n++) {
                System.out.print(" ");
            }
            for(int n = 0; n < Math.abs(num-Math.abs((num-1)/2-i+1)*2); n++) {
                System.out.print("*");
            }
            for(int n = 0; n < Math.abs((num-1)/2-i+1); n++) {
                System.out.print(" ");
            }
            System.out.print("\n");
            i++;
        }
    }
}
