package generic.test.ex3;

import generic.animal.Animal;

public class AnimalHospitalV3<T extends Animal>{
    //애니멀을 상속하기 때문에 기능들을 쓸 수 있다.
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }
    public void checkup(){


        System.out.println(animal.getName());
        System.out.println(animal.getSize());
        animal.sound();
    }
    public T bigger(T target){
        return null;
    }
}
