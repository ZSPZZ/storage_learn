package 习题4;

import java.util.Arrays;
public class b {
    public static void main(String[] args){
        int[] number = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        for(int i: number){
            for(int j = 1; j <= i; j++){
                System.out.print(i+"*"+j+"="+i*j+" ");
            }
            System.out.print("\n");
        }
    }
}
