package generic.ex2;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMain2 {
    public static void main(String[] args) {
        Animal animal = new Animal("동물",10);
        Dog dog = new Dog("멍멍이",100);
        Cat Cat = new Cat("야옹이",40);

        Box<Animal> animalBox = new Box<>();
        //dog나 cat은 animal자식이므로 Animal타입으로 할수 있다
        animalBox.set(animal);
        animalBox.set(dog);
        animalBox.set(Cat);

        Animal findAnimal = animalBox.get();
        System.out.println(findAnimal);
    }
}
