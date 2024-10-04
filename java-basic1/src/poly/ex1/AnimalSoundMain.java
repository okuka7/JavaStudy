package poly.ex1;

public class AnimalSoundMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        System.out.println("동물 소리 테스트 시작");
        dog.sound();
        System.out.println("종료");
        cat.sound();
        System.out.println("종료");
        caw.sound();
        System.out.println("종료");
    }

    private static void soundCaw(Caw caw) {
        caw.sound();
    }
    //타입이 다르기 때문에 soundCaw 함께 사용하는 것은 불가능하다.
}

