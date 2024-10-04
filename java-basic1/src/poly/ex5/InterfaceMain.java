package poly.ex5;

public class InterfaceMain {
    public static void main(String[] args) {
        //인터페이스 완전 추상이라서 생성 불가
        //InterfaceAnimal interfaceAnimal = new InterfaceAnimal() {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Caw caw = new Caw();
    }

    private static void soundAnimal(InterfaceAnimal animal) {
        System.out.println("시작");
        animal.sound();
        System.out.println("끝");
    }

    private static void moveAnimal(InterfaceAnimal animal) {
        System.out.println("시작");
        animal.move();
        System.out.println("끝");
    }
    //Interface는 순수 추상 클래스와 비슷하다고 생각하면 된다.
}
