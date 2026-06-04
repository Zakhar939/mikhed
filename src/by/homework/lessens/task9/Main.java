package by.homework.lessens.task9;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo(2);


        Dog dog1 = new Dog("шарик", "дворняга", 30.5,
                "чёрный", 12, "мясо");
        Bird bird1 = new Bird("снегирь", 100, "разноцветный", 3, "насекомые");

        Dog dog2 = new Dog("рекс", "пудель", 10, "рыжий", 10, "мясо");
        Bird bird2 = new Bird("голубь", 90, "серый", 4, "насекомые");

        Dog dog3 = new Dog("бобик", "овчарка", 25.0, "gray", 13, "мясо");
        Bird bird3 = new Bird("воробей", 150, "brown", 4, "растения");

        dog1.makeSound();
        dog1.bark();
        dog1.bite();
        dog1.run();
        dog1.jump();
        dog1.play();
        System.out.println("-----------------------------");

        bird1.makeSound();
        bird1.sing();
        bird1.peck();
        bird1.incubateEggs();
        bird1.play();
        System.out.println("-----------------------------");

        zoo.addAnimal(dog1);
        zoo.addAnimal(bird1);
        zoo.addAnimal(dog2);
        zoo.addAnimal(bird2);
        zoo.addAnimal(dog3);
        zoo.addAnimal(bird3);


        Animal[] allAnimals = zoo.getAnimals();
        for (Animal animal : zoo.getAnimals()) {
            if (animal != null) {
                System.out.println(animal);
            }
        }
        System.out.println("-----------------------------");


        for (Animal animal : zoo.getAnimals()) {
            if (animal != null) {
                animal.makeSound();
            }
        }

        for (Animal animal : zoo.getAnimals()) {
            if (animal != null) {
                animal.play();
            }
        }
    }
}

