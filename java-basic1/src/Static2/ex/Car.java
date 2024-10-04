package Static2.ex;

public class Car{
    private  static int totalcars;
    private String name;

    public Car(String name) {
        System.out.println("차량 구입,이름 " + name);
        this.name = name;
        totalcars++;
    }

    public static void showTotalCars() {
        System.out.println("구매한 차량 수 " + totalcars);
    }
}