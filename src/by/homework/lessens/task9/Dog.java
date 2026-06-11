package by.homework.lessens.task9;

import java.util.Objects;

public class Dog extends Animal {
    private String name;
    private String breed;
    private double averageWeight;

    public Dog(String name, String breed, double averageWeight, String color, int maxLifespan, String foodType) {
        super(color, maxLifespan, foodType);
        this.name = name;
        this.breed = breed;
        this.averageWeight = averageWeight;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " издаёт звук");
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

    public boolean equals(Object obj) {
        if (!(obj instanceof Dog)) {
            return false;
        }
        Dog other = (Dog) obj;

        if ((name == null ? other.name == null : name.equals(other.name))
                && (breed == null ? other.breed == null : breed.equals(other.breed))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (name == null ? 0 : name.hashCode());
        result = prime * result + (breed == null ? 0 : breed.hashCode());
        return result;
    }
}
