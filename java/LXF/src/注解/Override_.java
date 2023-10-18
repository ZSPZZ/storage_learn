package  注解;

public class Override_ {
    public static void main(String[] args) {
        Person ming = new Person("Xiao Ming", 12);
        Person hong = new Person("Xiao Hong", 15);
        ming.number = 88;
        System.out.println(hong.number);
        hong.number = 99;
        System.out.println(ming.number);
        Person man = new Man("name", 99);
        man.pri();
    }

}

class Person {
    public String name;
    public int age;

    public static int number;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void pri(){
        System.out.println("0");
    }
}

class Man extends Person{
    public Man(String name, int age) {
        super(name, age);
    }

    @Override
    public void pri(){

        System.out.println("2");
    }


}
