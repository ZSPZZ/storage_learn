package 练习;

public class Shu_Zu_1 {
    //Java中的数组用来储存固定大小的同类型元素
    public static void main(String[] args){
        /*int arraySize = 10;
        int[] arrayRefVar;//声明数组变量
        arrayRefVar = new int[arraySize];//创建数组
        String[] arrayRefVar_1 = new String[arraySize];//声明的同时创建数组
        //or
        int[] arrayRefVar_2 = {1, 2, 3};*/
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(array[0]);
        try_0.change(array);
        System.out.println(1);
        System.out.println(array[0]);
    }
}

class try_0 {
    public static void change(int[] z){
        z = null;
    }
}
