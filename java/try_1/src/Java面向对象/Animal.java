package Java面向对象;

public class Animal {
    private String name;
    private  int id;
    public Animal(String name, int id){
        this.name = name;
        this.id = id;
    }
    public void eat(){
        System.out.println(name+"正在吃");
    }
    public void sleep(){
        System.out.println(name+"正在睡");
    }
    public void introduction(){
        System.out.println("大家好！我是"+id+"号"+name+".");
    }
}
class Penguin extends Animal{
    public Penguin(String name, int id){
        super(name, id);
    }
    public static void main(String[] args){
        Penguin qie = new Penguin("企鹅", 2);
        qie.sleep();
        littlePenguin xiaoqie = new littlePenguin("二比", 5);
        xiaoqie.introduction();
    }
}
class littlePenguin extends Penguin{
    public littlePenguin(String name, int id){
        super(name, id);
    }
}
