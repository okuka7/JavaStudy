package lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }

    private static void action(Object obj){
        //obj.sound(); obj에는 sound가 없기 때문에 컴파일 오류가 발생한다.
        //obj.move(); obj에는 move가 없다. 컴파일 오류

        //객체에 맞는 다운캐스팅 필요
        if(obj instanceof Dog dog){ //자동으로 다운 캐스팅
            dog.sound();
        }else if(obj instanceof Car car){
            car.move();
        }
    }
}
