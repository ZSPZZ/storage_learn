package 注解;

public class Deprecated_ {
    public static void main(String[] args) {
        A a = new A();
        a.hi();
        System.out.println(a.n1);
    }
}

//1.修饰某个元素，表示该元素已经过时
//2.即不再推荐使用，但是仍然可以使用
//3.查看 @Deprecated
//4.可以修饰方法，类，字段、包、参数 等
//5.@Deprecated 可以做新旧版本的兼容和过渡
@Deprecated
class A{
    public int n1 = 10;
    public void hi(){

    }
}