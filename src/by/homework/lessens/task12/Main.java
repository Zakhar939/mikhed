package by.homework.lessens.task12;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car("Toyota", 150);
//        Motorcycle motorcycle = new Motorcycle("Honda", 80);
//
//        System.out.println(car.getName());
//        System.out.println(car.getEmissions());
//
//        car.setName("BMW");
//        car.setEmissions(200);
//
//        System.out.println(car.getName());
//        System.out.println(car.getEmissions());
//    }
//    Garage<Car> carGarage = new Garage<>();
//    Garage<Motorcycle> motorcycleGarage = new Garage<>();
//
//    carGarage.addVehicle(new Car("toyota", 150));
//    carGarage.addVehicle(new Car("BMW", 200));
//
//    motorcycleGarage.addVehicle(new Motorcycle("honda", 80));
//    motorcycleGarage.addVehicle(new Motorcycle("mazda", 90));
//
//    System.out.println("Автомобилей " + carGarage.getVehicleCount());
//    System.out.println("Мотоциклов " + motorcycleGarage.getVehicleCount());
//
//    Car car = carGarage.getVehicle(0);
//    System.out.println("Первый автомобиль: " + car.getName());
//
//    Motorcycle motorcycle = motorcycleGarage.getVehicle(0);
//    System.out.println("Первый мотоцикл: " + motorcycle.getName());
//}

        Garage<Car> carGarage = new Garage<>();
        Garage<Motorcycle> motorcycleGarage = new Garage<>();

        Car car = new Car("Toyota", 150);
        Motorcycle motorcycle = new Motorcycle("Honda", 80);

        System.out.println("Транспортное средство: " + car.getName());
        System.out.println("Въезд разрешён: " + carGarage.isEntryPermitted(car));

        System.out.println("Транспортное средство: " + motorcycle.getName());
        System.out.println("Въезд разрешён: " + motorcycleGarage.isEntryPermitted(motorcycle));
    }
}
