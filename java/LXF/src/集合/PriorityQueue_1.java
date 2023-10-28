package 集合;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Comparator;
public class PriorityQueue_1 {
    public static void main(String[] args) {
        Queue<User> q = new PriorityQueue<>(new UserComparator());
        q.offer(new User("B", "A2"));
        q.offer(new User("A", "A10"));
        q.offer(new User("C", "V2"));
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
    }
}

class UserComparator implements Comparator<User>{
    String name;

    @Override
    public int compare(User u1, User u2) {
        if (u1.number.charAt(0) == u2.number.charAt(0)) {
            return Integer.valueOf(u1.number.substring(1)).compareTo(Integer.valueOf(u2.number.substring(1)));
        }
        if(u1.number.charAt(0) == 'V') {
            return -1;
        } else {
            return 1;
        }
    }
}

class User {
    public final String name;
    public final String number;

    public User(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String toString() {
        return name + "/" + number;
    }
}