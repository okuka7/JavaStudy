package Static2.ex;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car("K3");
        Car car2 = new Car("gG60");
        Car car3 = new Car("6800");

        Car.showTotalCars();//구매한 차량 수를 출력하는 static메서드
    }

}
