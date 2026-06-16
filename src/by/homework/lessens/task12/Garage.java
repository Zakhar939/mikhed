package by.homework.lessens.task12;

import java.util.ArrayList;
import java.util.List;

public class Garage<T extends Vehicle> {
    private List<T> vehicles;

    public Garage() {
        vehicles = new ArrayList<>();
    }

    public void addVehicle(T vehicle) {
        vehicles.add(vehicle);
    }

    public T getVehicle(int index) {
        return vehicles.get(index);
    }

    public List<T> getAllVehicles() {
        return vehicles;
    }

    public int getVehicleCount() {
        return vehicles.size();
    }
    public boolean isEntryPermitted(T vehicle) {
        if (vehicle.getEmissions() > 100) {
            return false;
        }
        return true;
    }
}
//