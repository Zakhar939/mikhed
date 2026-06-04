package by.homework.lessens.task9;

import java.util.Objects;

public class Dog extends Animal{
    private String name;
    private String breed;
    private double averageWeight;

    public Dog(String name, String breed, double averageWeight, String color, int maxLifespan, String foodType){
        super(color, maxLifespan, foodType);
        this.name = name;
        this.breed = breed;
        this.averageWeight = averageWeight;
    }

    @Override
    public void makeSound(){
        System.out.println(name+ " издаёт звук");
    }
    @Override
    public void play() {
        System.out.println(name + " играет");
    }
    public void bark() {
        System.out.println(name + " гаф");
    }

    public void bite() {
        System.out.println(name + " кусает");
    }

    public void run() {
        System.out.println(name + " бежит");
    }

    public void jump() {
        System.out.println(name + " прыгает");
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public double getAverageWeight() {
        return averageWeight;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", averageWeight=" + averageWeight +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;


        if (obj == null || getClass() != obj.getClass()) return false;

        Dog dog = (Dog) obj;

        return Objects.equals(name, dog.name) &&
                Objects.equals(breed, dog.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, breed);
    }
}
