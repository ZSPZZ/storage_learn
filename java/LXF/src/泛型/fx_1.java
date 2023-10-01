package 泛型;

import java.util.*;

public class fx_1 {
    public static void main(String[] args){
        //创建可以储存String的ArrayList
        List<String> nb = new ArrayList<>();
        nb.add("你好");
        String s = nb.get(0);
        //strList.add(new Integer(123));

        List<Float> li = new List<Float>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Float> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Float aFloat) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Float> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Float> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Float get(int index) {
                return null;
            }

            @Override
            public Float set(int index, Float element) {
                return null;
            }

            @Override
            public void add(int index, Float element) {

            }

            @Override
            public Float remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Float> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Float> listIterator(int index) {
                return null;
            }

            @Override
            public List<Float> subList(int fromIndex, int toIndex) {
                return null;
            }
        };

        List<Number> list = new List<Number>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Number> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Number number) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Number> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Number> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Number get(int index) {
                return null;
            }

            @Override
            public Number set(int index, Number element) {
                return null;
            }

            @Override
            public void add(int index, Number element) {

            }

            @Override
            public Number remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Number> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Number> listIterator(int index) {
                return null;
            }

            @Override
            public List<Number> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
    }
}
