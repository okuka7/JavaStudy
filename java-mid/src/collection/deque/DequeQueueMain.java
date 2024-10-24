package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeQueueMain {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.offer(1);
        deque.offer(2);
        deque.offer(3);
        // 다음 꺼낼 데이터 확인(꺼내지 않고 단순 조회만)
        System.out.println(deque.peek());

        //데이터 꺼내기
        System.out.println(deque.poll());
        System.out.println(deque.poll());
        System.out.println(deque.poll());
        System.out.println(deque);


        //Deque 인터페이스는 Queue 인터페이스의 자식이기 때문에, 단순히 Queue의 기능만 필요하면 Queue 인터페이스를 사용하고, 더 많은 기능이 필요하다면 Deque 인터페이스를 사용하면된다.
        //그리고 구현체로 성능이 빠른 ArrayDeque를 사용하자.
    }
}
