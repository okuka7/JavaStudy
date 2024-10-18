package generic.test.ex5;

import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain1 {
    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("멍멍이",100));

        WildcardEx.printGenericV1(dogBox);
        WildcardEx.printGenericV2(dogBox);
        WildcardEx.printWildcardV1(dogBox);
        WildcardEx.printWildcardV2(dogBox);
        WildcardEx.printAndReturnWildcard(dogBox);


        catBox.set(new Cat("야옹이", 3900));
        Cat cat = WildcardEx.printAndReturnGeneric(catBox);
        //Dog dog = WildcardEx.printAndReturnWildcard(dogBox)
        //와일드 카드는 애니멀 타입만 반환해서 쓸수밖에 없다.

        // printAndReturnGeneric은 다음과 같이 전달한 타입을 명확하게 반환할 수 있다.
        //printAndReturnWildcard의 경우 전달한 타입을 명확하게 반환할 수 없다. 여기서는 animal 타입으로 반환한다.





    }
}
