package by.homework.lessens.task11;

public class RobotSapper implements Robot, RobotEngineer {
    private String model;
    private double powerConsumption;
    private int chassisNumber;
    private String material;
    public boolean isOn;

    RobotSapper(String model, double powerConsumption, int chassisNumber, String material) {
        this.model = model;
        this.powerConsumption = powerConsumption;
        this.chassisNumber = chassisNumber;
        this.material = material;
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
        System.out.println("Разминирует с шасси " + chassisNumber);
    }

    @Override
    public void repairRobot() {
        System.out.println("Сапёр отремонтирован специальными средствами");
    }
    @Override
    public void createItem() {
        System.out.println("Сапёр создаёт приспособление для разминирования");
    }
}