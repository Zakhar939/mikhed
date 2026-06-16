package by.homework.lessens.task9;

public class Zoo {
    private Animal[] animals;
    private int size;
    private int capacity;

    public Zoo(int capacity) {
        this.capacity = capacity;
        this.animals = new Animal[capacity];
        this.size = 0;


    }

    public void addAnimal(Animal animal) {
        Animal[] newAnimals = new Animal[capacity + 1];
        for (int i = 0; i < size; i++) {
            newAnimals[i] = animals[i];
        }
        newAnimals[size] = animal;
        animals = newAnimals;
        size++;
        capacity++;
    }

    public int getSize() {
        return size;
    }

    public Animal[] getAnimals() {
        return animals;
    }

}
