package 练习;

public class Puppy {
    int age;
    private static int number = 6;
    public Puppy(String name){
        System.out.println("小狗的名字是" + name);
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        System.out.println("年龄"+age);
        return age;
    }

    public static void main(String[] args){
        System.out.println(Puppy.number);
        Puppy myPuppy = new Puppy("尼玛");
        myPuppy.setAge(2);
        myPuppy.getAge();
        System.out.println(Puppy.number);
    }
}

class dog{
    int asd;
}
