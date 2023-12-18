package point;//(point包内定义Point类)

public class Point {
    private int x;
    private int y;
    public Point(int x,int y){
        this.x=x;//重名访问全局变量
        this.y=y;
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public String toString(){
        return String.format("(%d,%d)",x,y);
    }
}
