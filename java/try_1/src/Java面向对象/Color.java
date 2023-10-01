package Java面向对象;

public enum Color {
    RED, GREEN, BLUE;
    int count = 0;
    private Color()
    {
        System.out.println("Constructor called for : " + this.toString());
        count++;
    }

    public void colorInfo()
    {
        System.out.println("Universal Color");
        System.out.println(count);
    }
}

class Test
{
    // 输出
    public static void main(String[] args)
    {
        Color c1 = Color.RED;
        System.out.println(c1);
        c1.colorInfo();
    }
}