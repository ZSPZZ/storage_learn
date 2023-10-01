package Java面向对象;

public class Override_1 {
    public static void main(String[] args){
        Animals animal = new Animals();
        animal.move();
        Animals aDog = new Dog();
        Dog dDog = new Dog();
        aDog.move();
        //aDog.bark();
        dDog.bark();
    }
}

class Animals{
    public void move(){
        System.out.println("动物可以动");
    }
}
class Dog extends Animals{
    public void move(){
        super.move();
        System.out.println("狗可以动");
    }
    public void bark(){
        System.out.println("狗可以吠叫");
    }
}
