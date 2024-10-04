package lang.object.poly;

public class ObjectPolyExample2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        Object object = new Object(); //Object 인스턴스도 만들수 있다.

        Object[] objects = {dog,car, object};//object는 다 담을 수 있다.

        size(objects);
    }
    private static void size(Object[] objects) {
        System.out.println("전달된 객체의 수는 " + objects.length);
    }
    //object를 만든 덕분에 모든 타입의 객체를 담을 수 있는 배열을 만들 수 있었다.
}
