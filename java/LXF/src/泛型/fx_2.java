package 泛型;

import java.util.Arrays;

public class fx_2 {
    public static void main(String[] args){
        fxPerson man = new fxPerson("zhang", 55);
        fxPerson[] pp = new fxPerson[]{
                new fxPerson("Bob", 32),
                new fxPerson("FXF", 12),
                man
        };
        Arrays.sort(pp);
        System.out.println(Arrays.toString(pp));
    }
}

class fxPerson implements Comparable<fxPerson>{
    protected String name;
    protected int score;

    public fxPerson(String name, int score){
        this.name = name;
        this.score = score;
    }

    public int compareTo(fxPerson other){
        return this.name.compareTo(other.name);
    }
}
