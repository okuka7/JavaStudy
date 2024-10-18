package generic.test.ex4;

import generic.animal.Animal;

public class ComplexBox <T extends Animal> {

    private T animal;

    public void set(T animal){
        this.animal = animal;
    }

    public<Z> Z printAndReturn(Z z){
        System.out.println(animal.getClass().getName());
        System.out.println(z.getClass().getName());
        return z;
        //프로그래밍에서는 모호한것은 좋지않다.
        //그러므로 모호할경우, 둘의 이름이 겹칠 경우 , 이름을 다르게 설정해주는 것이 좋다.
    }

}
