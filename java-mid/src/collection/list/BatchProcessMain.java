package collection.list;

public class BatchProcessMain {
    public static void main(String[] args) {
        //MyArrayList<Integer> list = new MyArrayList<>();
        MyLinkedList<Integer> list = new MyLinkedList<>();
        //링크드 쓸지 어레이 쓸지 여기서 설정해준다. 추상화

        BatchProcessor processor = new BatchProcessor(list);
        processor.logic(1_000_000);

    }
}
