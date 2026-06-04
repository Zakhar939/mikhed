package by.homework.lessens.task9;

public class Animal {
    private String color;
    private int maxLifespan;
    private String foodType;

    public Animal(String color, int maxLifespan, String foodType){
        this.color = color;
        this.maxLifespan = maxLifespan;
        this.foodType = foodType;
    }
    public void makeSound(){
        System.out.println("издание звуков");
    }
    public void  play(){
        System.out.println("Животное играет");
    }

    public String getColor() {
        return color;
    }

    public String getFoodType(){
        return foodType;
    }
    public int getMaxLifespan(){
        return maxLifespan;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "color='" + color + '\'' +
                ", maxLifespan=" + maxLifespan +
                ", foodType='" + foodType + '\'' +
                '}';
    }
}
