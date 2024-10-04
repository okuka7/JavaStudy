package poly.car1;

import poly.car1.Model3Car;

public class CarMain1 {
    public static void main(String[] args) {
        Driver driver = new Driver();

        //차량 선택
        K3Car k3Car = new K3Car();
        driver.setCar(k3Car);
        driver.drive();
        //차량 변경 -> model3Car
        Model3Car model3Car = new Model3Car();
        driver.setCar(model3Car);
        driver.drive();
        //새로운 차량
        NewCar newCar = new NewCar();
        driver.setCar(newCar);
        driver.drive();
        //새로운 차를 만들때 드라이버를 전혀 건들지 않았다. 여기서 클라이언트는 드라이버이다.
    }
}
