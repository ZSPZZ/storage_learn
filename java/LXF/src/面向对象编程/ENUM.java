package 面向对象编程;

public class ENUM {
    public static void main(String[] args){
        String s = day.Friday.name();
    }
}

enum day{
    Monday(1), Tuesday(2), Wednesday(3), Thursday(4), Friday(5), Saturday(6), Sunday(7);

    public final int dayValue;

    private day(int dayValue){
        this.dayValue = dayValue;
    }
}
