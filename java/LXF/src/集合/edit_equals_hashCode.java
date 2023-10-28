package 集合;

import java.util.Objects;

public class edit_equals_hashCode {
    public static void main(String[] args) {

    }

}

class Student_0 {
    public String name;
    public int score;
    public Student_0(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public int hashCode() {
        int h = 0;
        h = 31 * h + name.hashCode();
        h = 31 * h + score;
        return h;
    }
    @Override
    public boolean equals(Object o) {
        if(o instanceof Student_0 s) {
            return Objects.equals(s.name, this.name) && s.score == this.score;
        }
        return false;
    }
}