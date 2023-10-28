package 练习;

import java.util.*;
public class c {
    public static void main(String[] args) {
        List<Message> received = List.of(
                new Message(1, "Hello!"),
                new Message(2, "发工资了没?"),
                new Message(2, "发工资了没?"),
                new Message(3, "去哪吃饭？"),
                new Message(3, "去哪吃饭？"),
                new Message(4, "Bye")
        );

        List<Message> displayMessages = process(received);

        for (Message mes : displayMessages) {
            System.out.println(mes.text);
        }
    }

    static List<Message> process(List<Message> received) {
        // TODO:按sequence去除重复消息
        Set<Message> set = new HashSet<>(received);
        /*
        使用HashSet需要重写hashCode()和equals()方法，
        在Java中，HashSet依赖于这两个方法来判断两个对象是否相等
        这两个方法默认会使用对象的内存地址来判断对象是否相等，
        而不是根据实际的属性值。
        */
        /*for (Message mes : received) {
            set.add(mes);
        }*/
        // System.out.println(set);
        return new ArrayList<>(set);// ArrayList(Collection<? extends E> c)构造一个包含指定集合的元素的列表，按照它们由集合的迭代器返回的顺序。
    }
}

class Message {
    public final int sequence;
    public final String text;

    public Message(int sequence, String text) {
        this.sequence = sequence;
        this.text = text;
    }

    @Override
    public String toString() {
        return this.text;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Message m) {
            return Objects.equals(m.text, this.text) && m.sequence == this.sequence;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sequence, text);
    }
}