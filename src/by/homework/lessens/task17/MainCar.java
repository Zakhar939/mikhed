package by.homework.lessens.task17;

import java.io.*;

public class MainCar {

    public static void serializeCar() {
        Car car = new Car("BMW", 250, "Germany");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("car.ser"))) {
            oos.writeObject(car);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deserializeCar() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("car.ser"))) {
            Car car = (Car) ois.readObject();
            System.out.println("Десериализованный автомобиль:");
            System.out.println(car);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        serializeCar();
        deserializeCar();
    }
}
