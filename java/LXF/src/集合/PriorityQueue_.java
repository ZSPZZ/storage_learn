package 集合;

import java.util.PriorityQueue;
import java.util.Queue;
public class PriorityQueue_ {
    // 优先队列
    // 出队栓徐和元素的优先级有关，调用remove或poll方法返回的总是优先级最高的元素
    // 放入优先队列的元素必须实现Comparable接口
    public static void main(String[] args) {
        Queue<String> q = new PriorityQueue<>();
        // 添加3个元素到队列
        q.offer("apple");
        q.offer("2apple");
        q.offer("3apple");
        // 按照字符串顺序在队列中排序
        System.out.println(q.poll());// 2pple
        System.out.println(q.poll());// 3apple
        System.out.println(q.poll());// apple
        System.out.println(q.poll());// null,因为队列为空
    }
}
