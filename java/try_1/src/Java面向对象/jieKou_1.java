package Java面向对象;

public class jieKou_1 implements jieKou{
    public void eat(){
        System.out.println("我在吃");
    }
    public void travel(){
        System.out.println("我在旅游");
    }

    public static void main(String[] args){
        jieKou_1 jk = new jieKou_1();
        jk.eat();
    }
}
