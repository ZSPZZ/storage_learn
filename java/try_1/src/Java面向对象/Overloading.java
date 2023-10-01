package Java面向对象;

public class Overloading {
    public int test(){
        System.out.println("test1");
        return 1;
    }

    public void test(int a){
        System.out.println("test2");
    }

    //以下两个参数类型顺序不同
    public String test(int a, String s){
        System.out.println("test4");
        return "returnTest3";
    }

    public String test(String s, int a){
        System.out.println("test4");
        return "returnTest4";
    }

        public static void main(String[] args){
        Overloading o = new Overloading();
        System.out.println(o.test());
        o.test(2);
        System.out.print(o.test(1, "test3"));
        System.out.print(o.test("test4", 4));
        }
}
