package by.homework.lessens.task19;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MainCity {
    private static void stringExample() {
        StringHandler upperCaseHandler = value -> value.toUpperCase();
        System.out.println(upperCaseHandler.handle("привет"));
    }

    private static List<City> createCities() {
        return Arrays.asList(
                new City(1, "Мозырь", 150000, Continent.EUROPE),
                new City(2, "Москва", 12000000, Continent.EUROPE),
                new City(3, "Пекин", 21500000, Continent.ASIA),
                new City(4, "Токио", 14000000, Continent.ASIA));
    }

    private static void maxCityByContinent(List<City> cities, Continent continent) {
        Optional<City> city = cities.stream()
                .filter(c -> c.getContinent() == continent)
                .max(Comparator.comparingLong(City::getPopulation));
        System.out.println("--------1.2-------");

        city.ifPresent(System.out::println);
    }


    private static void minCityByContinent(List<City> cities, Continent continent) {
        Optional<City> city = cities.stream()
                .filter(c -> c.getContinent() == continent)
                .min(Comparator.comparingLong(City::getPopulation));
        System.out.println("--------1.3-------");

        city.ifPresent(System.out::println);
    }

    private static void maxCity(List<City> cities) {
        Optional<City> city = cities.stream()
                .max(Comparator.comparingLong(City::getPopulation));
        System.out.println("---------1.4------");

        city.ifPresent(System.out::println);
    }
    private static void minCity(List<City> cities) {
        Optional<City> city = cities.stream()
                .min(Comparator.comparingLong(City::getPopulation));
        System.out.println("---------1.5------");

        city.ifPresent(System.out::println);
    }
    private static void firstCityOverMillion(List<City> cities) {
        Optional<City> city = cities.stream()
                .filter(c -> c.getPopulation() > 1_000_000)
                .findFirst();
        System.out.println("---------1.6------");

        city.ifPresent(System.out::println);
    }
    private static void citiesOverMillion(List<City> cities) {
        List<City> result = cities.stream()
                .filter(c -> c.getPopulation() > 1_000_000)
                .collect(Collectors.toList());
        System.out.println("---------1.7------");

        result.forEach(System.out::println);
    }
    private static void cityNames(List<City> cities) {
        List<String> names = cities.stream()
                .map(City::getName)
                .collect(Collectors.toList());
        System.out.println("---------1.8------");

        System.out.println(names);
    }

    public static void main(String[] args) {
        stringExample();

        List<City> cities = createCities();
        maxCityByContinent(cities, Continent.EUROPE);
        minCityByContinent(cities, Continent.ASIA);
        maxCity(cities);
        minCity(cities);
        firstCityOverMillion(cities);
        citiesOverMillion(cities);
        cityNames(cities);
    }

}
