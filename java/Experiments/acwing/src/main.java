import point.Point;

class Student {//定义一个类
    public int z=-1;
    private int y;
    protected int c;
    int d;//无修饰符同一包内可使用
    public static int x=-1;//静态变量
}
public class main {//唯一main函数
    public static void main(String [] args){
        Student student = new Student();//定义Student类变量
        //student.y=2; 私有变量不可引用
        Student student1= new Student(),student2 = new Student(), student3 = new Student();
        Student.x=3;//公有变量用类名访问
        System.out.printf("%d,%d,%d\n",student1.x,student2.x,student3.x);//通过实例访问公有变量
        student1.z=2;
        System.out.printf("%d,%d,%d\n",student1.z,student2.z,student3.z);//改变普通变量
        //公有函数只能访问公有的函数和变量
       Point point = new Point(3,4);
       System.out.println(point.toString());
       System.out.println(point.getX());

    }
}
