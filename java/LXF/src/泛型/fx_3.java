package 泛型;

public class fx_3<T> {
    private T first;
    private T last;
    public T getFirst() {
        return first;
    }

    public T getLast() {
        return last;
    }

    public fx_3(T first, T last){
        this.first = first;
        this.last = last;

    }
    //静态方法不能引用泛型类型 <T>, 必须定义其他类型
    public static <A> fx_3<A> create(A first, A last){
        return new fx_3<A>(first, last);
    }
}
//多个泛型类型
class cl<Y, K>{
    public void setAge(Y age) {
        this.age = age;
    }

    public void setLength(K length) {
        this.length = length;
    }

    private Y age;
    private K length;

    public static <O> cl<O, O>  create(O age, O length){
        return new cl<O, O>();
    }
}
