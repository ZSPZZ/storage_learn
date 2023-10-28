package 集合;

import java.util.List;
import java.util.Objects;
public class editEquals_ {
    public static void main(String[] args) {
        List<String> list = List.of("A", "B", "C");
        System.out.println(list.contains(new String("C"))); // true or false?
        System.out.println(list.indexOf(new String("C"))); // 2 or -1?
    }
}

class Person {
    public String name;
    public int age;

    public boolean equals(Object o) {
        if(o instanceof Person p) {
            return Objects.equals(this.name, p.name) && this.age == p.age;
        }
        return false;
    }

    /*public boolean equals (Object o) {
        if (o instanceof Person p) {
            boolean nameEquals = false;
            if (this.name == null && p.name == null) {
                nameEquals = true;
            }
            if (this.name != null) {
                nameEquals = this.name.equals((p.name));
            }
            return this.name.equals(p.name) && this.age == p.age;
        }
        return false;
    }*/


}
