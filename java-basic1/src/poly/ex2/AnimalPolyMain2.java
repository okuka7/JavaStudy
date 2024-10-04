package poly.ex2;

public class AnimalPolyMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        Animal[] animalArrr = {dog,cat,caw};
        Animal index1 = dog;
        Animal index2 = cat;
        Animal index3 = caw;

        for (Animal animal : animalArrr) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("종료 ");
        }
        //오버라이딩 때문에 각자의 울음 소리가 나온다.
        //다형적 참조 덕분에 animal변수는 자식인 Dog,Cat,Caw의 인스턴스를 참조 할 수 있다.


    }
}
