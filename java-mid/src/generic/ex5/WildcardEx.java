package generic.ex5;

import generic.animal.Animal;

public class WildcardEx {
    static <T> void printGenericV1(Box<T> box){
        System.out.println("T = " + box.get());
    }

    //Box<Dog> Box<Cat> Box<Object>
    static void printWildcardV1(Box<?> box){
        //물음표에 아무거나 다 들어올수 있다는 뜻이다.
        System.out.println(box.get());
    }


    static <T extends Animal> void printGenericV2(Box<T> box){
        T t = box.get();
        System.out.println("T = " + t.getName());
    }

    static void printWildcardV2(Box<? extends Animal> box){
        Animal animal = box.get();
        System.out.println("T = " + animal.getName());
    }

    static <T extends Animal> T printAndReturnGeneric(Box<T> box) {
    T t = box.get();
    System.out.println("T = " + t.getName());
    return t;
    }

    static Animal printAndReturnWildcard(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("T = " + animal.getName());
        return animal;
    }
    //와일드 카드는 제네릭 타입이나, 제네릭 메서드를 선언하는 것이 아니다. 와일드카드는 이미 만들어진 제네릭 타입을 활용할 때 사용한다.
    //제네릭 타입ㅈ이나 제네릭 메서드를 정의하는게 꼭 필요한 상황이 아니라면, 더 단순한 와일드 카드 사용을 권장한다.
}
