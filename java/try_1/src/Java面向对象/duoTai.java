package Java面向对象;

public class duoTai {
    public static void main(String[] args){
        show(new Cat());
        show(new dDog());

        Animal_s a = new Cat();
        a.eat();
        Cat c =(Cat)a;
        c.work();
    }

    public static void show(Animal_s a){
        a.eat();
        if (a instanceof Cat){
            Cat c = (Cat)a;
            c.work();
        } else if (a instanceof dDog) {
            dDog c = (dDog)a;
            c.work();
        }
    }
}

abstract class Animal_s{
    abstract void eat();
}

class Cat extends Animal_s{
    public void eat(){
        System.out.println("吃鱼");
    }
    public void work(){
        System.out.println("抓老鼠");
    }
}

class dDog extends Animal_s{
    public void eat(){
        System.out.println("吃骨头");
    }
    public void work(){
        System.out.println("狗工作");
    }
}