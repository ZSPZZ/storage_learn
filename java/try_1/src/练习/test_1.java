package 练习;

public class test_1 {
    static void doIt(int[] z){
        int temp = z[z.length - 1];
        z[z.length - 1] = z[0];
        z[0] = temp;
    }
}

class TestIt{
    public static void main(String[] args){
        int[] myArray = {1, 2, 3, 4, 5};
        test_1.doIt(myArray);
        for(int j = 0; j < 5; j++){
            System.out.print(myArray[j] + " ");
        }
    }
}