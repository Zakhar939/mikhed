package by.homework.lessens.task11;

public class RobotBuilder implements Robot, RobotEngineer {
    private String model;
    private double powerConsumption;
    private String manufacturerCountry;
    private String constructionUnit;
    private String material;
    boolean isOn;

    RobotBuilder(String model, double powerConsumption, String manufacturerCountry, String constructionUnit, String material) {
        this.model = model;
        this.powerConsumption = powerConsumption;
        this.manufacturerCountry = manufacturerCountry;
        this.constructionUnit = constructionUnit;
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
        System.out.println("Строит с " + constructionUnit + " из " + material);
    }

    @Override
    public void createItem() {
        System.out.println("Строитель создаёт бетон");
    }
}
