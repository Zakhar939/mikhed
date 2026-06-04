package by.homework.lessens.task9;

import java.util.Objects;

public class Bird extends Animal{
    private String species;
    private int maxFlightHeight;

    public Bird(String species, int maxFlightHeight, String color, int maxLifespan, String foodType) {
        super(color, maxLifespan, foodType);
        this.species = species;
        this.maxFlightHeight = maxFlightHeight;
    }

    @Override
    public void makeSound() {
        System.out.println(species + " издаёт звук");
    }

    @Override
    public void play() {
        System.out.println(species + " играет");
    }

    public void sing() {
        System.out.println(species + " поёт");
    }

    public void peck() {
        System.out.println(species + " клюёт");
    }

    public void incubateEggs() {
        System.out.println(species + " высиживает птенцов");
    }

    // Getters
    public String getSpecies() {
        return species;
    }

    public int getMaxFlightHeight() {
        return maxFlightHeight;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "species='" + species + '\'' +
                ", maxFlightHeight=" + maxFlightHeight +
                '}';
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        Bird bird = (Bird) obj;

        return Objects.equals(species, bird.species);
    }

    @Override
    public int hashCode() {
        return Objects.hash(species);
    }
}
