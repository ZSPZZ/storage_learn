package 面向对象编程;

public class StrBuilder {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder(1024);
        for (int i = 0; i < 1000; i++){
            sb.append(',');
            sb.append(i);
        }
        String s = sb.toString();
        System.out.println(s);
    }
}

class StrBuilder_0{
    public static void main(String[] args){
        var sb = new StringBuilder(1024);
        //链式操作
        sb.append("Mr ")
                .append("Bob")
                .append("!")
                .insert(0, "Hello, ");
        System.out.println(sb.toString());
    }
}
