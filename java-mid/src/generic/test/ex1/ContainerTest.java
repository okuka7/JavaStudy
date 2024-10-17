package generic.test.ex1;

public class ContainerTest {
    public static void main(String[] args) {
        Container <String> stringContainer = new Container<>();
        System.out.println(stringContainer.isEmpty());

        stringContainer.setItem("data1");
        System.out.println(stringContainer.isEmpty());
        System.out.println(stringContainer.getItem());

        Container<Integer> integerContainer = new Container<>();
        integerContainer.setItem(10);
        System.out.println(integerContainer.getItem());
    }
}
