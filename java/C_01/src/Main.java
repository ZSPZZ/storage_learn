import javax.swing.*;
import java.awt.*;

public class Main{
    public static void main(String[] args){
        //创建容器
        JFrame frm = new JFrame();

        //设置标题
        frm.setTitle("JAVA标题");
        //设置布局
        frm.setLayout(new BorderLayout());
        //创建按钮组件
        JButton myBtn = new JButton("按钮");
        //将按钮组件对象添加到容器中
        frm.getContentPane().add(myBtn);
        //或 frm.add(myBtn);

        //该示例未添加事件

        //设置窗口初始位置与大小并显示
        frm.setBounds(500, 200, 200, 100);
        //设置窗体关闭方式
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //让窗体显示
        frm.setVisible(true);
    }
}
