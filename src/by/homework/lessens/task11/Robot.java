package by.homework.lessens.task11;

public interface Robot {
    void turnOn();

    void turnOff();

    void uniquePossibility();

    default void repairRobot() {
        System.out.println("Робот отремонтирован");
    }
}

