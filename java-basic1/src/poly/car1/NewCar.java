package poly.car1;

public class NewCar implements Car {
    @Override
    public void startEngine() {
        System.out.println("newCarStartEngine");
    }

    @Override
    public void offEngine() {
        System.out.println("newCarOffEngine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("newCarPressAccelerator");
    }
}
