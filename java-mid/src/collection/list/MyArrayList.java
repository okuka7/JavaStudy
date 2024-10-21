package collection.list;

import java.util.Arrays;

public class MyArrayList<E> implements MyList<E> {
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayList() {
        elementData = new Object[DEFAULT_CAPACITY];
    }
    public MyArrayList(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    @Override
    public int size(){
        return size;
    }

    @Override
    public void add(E e){
        if(size == elementData.length){
            grow();
        }

        elementData[size++] = e;
        size++;

    }
    @Override
    public void add(int index, E e){
        if(size == elementData.length){
            grow();
        }
        //데이터 이동
        shiftRightFrom(index);
        elementData[index] = e;
        size++;
    }
    //코드 추가, 요소의 마지막 붜 index 까지 오른쪽으로 밀기
    private void shiftRightFrom(int index) {
        for(int i = size; i>index; i--){
            elementData[i] = elementData[i-1];
        }
    }

    //코드 추가
    public E remove(int index){
        E oldValue = get(index);
        //데이터 이동
        shiftLeftFrom(index);
        size--;
        elementData[index] = null;
        return oldValue;
    }
    //코드 추가 요소의 index 부터 마지막까지 왼쪽으로 밀기
    private void shiftLeftFrom(int index) {
        for(int i = index; i<size; i++){
            elementData[i] = elementData[i+1];
        }
    }

    //길이가 2배의 크기 추가
    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;
        //배열을 새로 만들고, 기존 배열을 새로운 배열에 복사
//        Object[] newArr = new Object[newCapacity];
//        for(int i = 0; i < elementData.length; i++){
//            newArr[i] = elementData[i];
//        }
        //위의 과정을 아래의 한줄로 바꿀수 있다.
        elementData = Arrays.copyOf(elementData, newCapacity);
    }
    @Override
    public E get(int index){
        return (E) elementData[index];
    }
    @Override
    public E set(int index, E e){
        E oldValue = get(index);
        elementData[index] = e;
        return oldValue;
    }
    @Override
    public int indexOf(E o){
        for (int i = 0; i < size; i++) {
            if(o.equals(elementData[i])){
                return i;
            }
        }
        return -1;
    }
    @Override
    public String toString(){
        return Arrays.toString(Arrays.copyOf(elementData, size)) +
                size + elementData.length; //배열에서 크기만큼 카피하는 것이다.
    }
}
