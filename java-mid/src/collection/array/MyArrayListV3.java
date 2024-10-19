package collection.array;

import java.util.Arrays;

public class MyArrayListV3 {
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV3() {
        elementData = new Object[DEFAULT_CAPACITY];
    }
    public MyArrayListV3(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }
    public int size(){
        return size;
    }

    public void add(Object e){
        //코드 추가
        if(size == elementData.length){
            grow();
        }

        elementData[size++] = e;

    }

    public void add(int index, Object e){
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
    public Object remove(int index){
        Object oldValue = get(index);
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
