package Java快速入门;

public class for_each {
    public static void main(String[] args){
        int[] ns = new int[] {1, 3, 4, 6, 7};

        System.out.println(ns.length);
        String[] st = new String[] {"1", "2", "3"};
        System.out.println(st[1]);
        String st2 = "尼玛";
        System.out.println(st2);

        for(int n : ns){
            System.out.println(n);
        }
    }
}

