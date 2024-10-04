package poly.ex2;

public class AnimalPolyMain1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
        //오버라이딩 때문에 각자의 울음 소리가 나온다.
        //다형적 참조 덕분에 animal변수는 자식인 Dog,Cat,Caw의 인스턴스를 참조 할 수 있다.


    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("종료");
    }
}
