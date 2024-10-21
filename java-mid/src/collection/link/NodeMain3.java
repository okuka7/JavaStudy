package collection.link;

public class NodeMain3 {
    public static void main(String[] args) {
        //노드 생성하고 연결하기 A->B->C
        Node first = new Node("A"); //x01
        first.next = new Node("B"); //x02
        first.next.next = new Node("C"); //x03

        System.out.println("현결된 노드 출력하기");
        System.out.println(first);

        //모든 노드 탐색하기
        System.out.println("모든 노드 탐색하기");
        printAll(first);

        //마지막 노드 조회하기
        Node lastNode = getLastNode(first);
        System.out.println(lastNode);

        //특정 인덱스의 노드 조회하기
        int index = 2;
        Node index2Node = getNode(first,index);
        System.out.println(index2Node.item);

        //데이터 추가하기
        System.out.println("데이터 추가하기");
        add(first,"A");

    }

    private static void add(Node node, String param) {
        Node lastNode = getLastNode(node);
        lastNode.next = new Node(param);
    }

    private static Node getNode(Node node, int index) {
        Node x = node;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    private static Node getLastNode(Node node) {
        Node x = node;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    private static void printAll(Node node) {
        Node x = node;
        while (x != null) {
            System.out.println(x.item);
            x = x.next;
        }
    }
}
