package collection.deque;

import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);

        //다음 꺼낼 요소 확인
        System.out.println(stack.peek());

        //스택 요소 뽑기
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);//데이터가 다 비어있다.

        //자바의 Stack 클래스는 내부에서 Vector 라는 자료 구조를 사용한다. 이 자료 구조는 자바 1.0에 개발 되었는데, 지금은 사용되지 않고 하위 호환을 위해
        //존재한다. 지금은 더 빠른 좋은 자료 구조가 많다. 따라서 Vector 를 사용하는 Stack 도 사용하지 않는 것을 권장한다. 대신에 이후에 설명할 Deque 를 사용하는 것이
        //좋다.
    }
}
