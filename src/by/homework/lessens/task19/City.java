package by.homework.lessens.task19;

public class City {
    private int id;
    private String name;
    private long population;
    private Continent continent;

    public City(int id, String name, long population, Continent continent) {
        this.id = id;
        this.name = name;
        this.population = population;
        this.continent = continent;
    }

    @Override
    public String toString() {
        return "Город" + id + " " + name  +
                ", население: " + population +
                ", континент: " + continent;
    }

    public Continent getContinent() {
        return continent;
    }

    public long getPopulation() {
        return population;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
