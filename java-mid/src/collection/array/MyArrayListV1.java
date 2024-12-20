package collection.array;

import java.util.Arrays;

public class MyArrayListV1 {
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV1() {
        elementData = new Object[DEFAULT_CAPACITY];
    }
    public MyArrayListV1(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }
    public int size(){
        return size;
    }

    public void add(Object e){
        elementData[size++] = e;

    }
    public Object get(int index){
        return elementData[index];
    }
    public Object set(int index, Object e){
        Object old = elementData[index];
        elementData[index] = e;
        return old;
    }
    public int indexOf(Object o){
        for (int i = 0; i < size; i++) {
            if(o.equals(elementData[i])){
                return i;
            }
        }
        return -1;
    }
    public String toString(){
        return Arrays.toString(Arrays.copyOf(elementData, size)) +
                size + elementData.length; //배열에서 크기만큼 카피하는 것이다.
    }
}
