package lang.object.equls;

public class EqualsMainV1 {
    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");

        System.out.println("identity = " + (user1 == user2));
        System.out.println("equality = " + (user1.equals(user2)));
        //자바다 다 알 수 없기 때문에 quals()메서드를 재정의 해줘야 한다.
    }
}
