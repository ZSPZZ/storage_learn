import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import java.io.InputStream;
import java.io.OutputStream;

public class try_2 {
    public static void main(String[] args) {
        thread t1 = new thread(56);
        thread t2 = new thread(2);
        t2.start();
        t1.start();
    }
}

class thread extends Thread{
    int i;
    public thread(int i) {
        this.i = i;
    }
    public void run() {
        System.out.println(i);
    }
}
