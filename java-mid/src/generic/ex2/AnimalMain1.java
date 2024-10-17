package generic.ex2;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMain1 {
    public static void main(String[] args) {
        Animal animal = new Animal("동물",10);
        Dog dog = new Dog("멍멍이",100);
        Cat Cat = new Cat("야옹이",40);

        Box<Dog> dogBox = new Box<>();
        dogBox.set(dog);
        Dog findDog = dogBox.get();
        System.out.println(findDog);

        Box<Cat> catBox = new Box<>();
        catBox.set(Cat);
        Cat findCat = catBox.get();
        System.out.println(findCat);

        Box<Animal> animalBox = new Box<>();
        animalBox.set(animal);
        Animal findAnimal = animalBox.get();
        System.out.println(findAnimal);
    }
}