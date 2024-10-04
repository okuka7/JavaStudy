package poly.ex4;

public class AbstractMain {
    public static void main(String[] args) {
        //추상클래스 생성 불가
        //AbstractAnimal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("시작");
        animal.sound();
        System.out.println("끝");
    }

    private static void moveAnimal(AbstractAnimal animal) {
        System.out.println("시작");
        animal.move();
        System.out.println("끝");
    }
}
