package poly.ex2;

public class AnimalPolyMain3 {
    public static void main(String[] args) {
        Animal[] animalArrr = {new Dog(),new Cat(),new Caw()};

        for (Animal animal : animalArrr) {
            soundAnimal(animal);
        }
        //오버라이딩 때문에 각자의 울음 소리가 나온다.
        //다형적 참조 덕분에 animal변수는 자식인 Dog,Cat,Caw의 인스턴스를 참조 할 수 있다.
    }
    //변하지 않는 부분
    //새로운 기능이 추가 되었을 때 변하는 부분을 최소화 한 코드가 잘 만들어진 코드이다.
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("종료 ");
    }
}
