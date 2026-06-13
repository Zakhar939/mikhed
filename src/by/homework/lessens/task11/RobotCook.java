package by.homework.lessens.task11;

public class RobotCook implements Robot {
    private String model;
    private double powerConsumption;
    private String manufacturerCountry;
    private String cookingUnit;
    boolean isOn;

    RobotCook(String model, double powerConsumption, String manufacturerCountry, String cookingUnit) {
        this.model = model;
        this.powerConsumption = powerConsumption;
        this.manufacturerCountry = manufacturerCountry;
        this.cookingUnit = cookingUnit;
        this.isOn = false;
    }

    @Override
    public void turnOn() {
        isOn = true;
    }

    @Override
    public void turnOff() {
        isOn = false;
    }

    @Override
    public void uniquePossibility() {
        System.out.println("Готовит с " + cookingUnit);
    }
}