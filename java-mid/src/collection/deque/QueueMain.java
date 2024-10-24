package collection.deque;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>(); //아무거나 써도 된다. 선택 이다.
        //Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println(queue);

        //다음 꺼낼 데이터 확인 (꺼내지 않고 단순 조회만)
        System.out.println(queue.peek());

        //데이터 꺼내기
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue);

        //큐 자료 구조 : 후입 선출과 반대로 가장 먼저 넣은 것이 가장 ㅁ너저 나오는 것을 선입 선출이라 한다. 이런 자료 구조를 큐라 한다.


    }
}
