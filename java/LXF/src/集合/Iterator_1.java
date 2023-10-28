package 集合;

import java.util.*;
public class Iterator_1 {
    public static void main(String[] args) {

    }
}

class ReverseList<T> implements Iterable<T> {
    // 实现了一个可以反向遍历的列表
    private List<T> list = new ArrayList<>();

    public void add(T t) {
        list.add(t);
    }

    @Override
    public Iterator<T> iterator() {
        return new ReverseIterator(list.size());
    }

    class ReverseIterator implements Iterator<T> {
        // 实现了一个相应的反向迭代器
        int index;

        ReverseIterator(int index) {
            this.index = index;
        }

        @Override
        public boolean hasNext() {
            return index > 0;
        }

        @Override
        public T next() {
            index--;
            return ReverseList.this.list.get(index);
        }
    }
}

