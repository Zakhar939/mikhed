package by.homework.lessens.task9;

import java.time.Period;
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

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        Bird other = (Bird) obj;


        if (species == null) {
            if (other.species != null) return false;
        } else if (!species.equals(other.species)) return false;

        if (maxFlightHeight != other.maxFlightHeight) return false;

        return true;
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (species == null ? 0 : species.hashCode());
        result = prime * result + maxFlightHeight;
        return result;
    }
}
