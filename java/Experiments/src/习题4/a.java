package 习题4;

import java.util.Arrays;
import java.util.Scanner;

public class a {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[3];
        for(int i = 0; i < 3; i++){
            numbers[i] = input.nextInt();
        }
        //sort
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                int x;
                if(numbers[j] < numbers[j+1]) {
                    x = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = x;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}

