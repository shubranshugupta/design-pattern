package vehicleadapter;

import vehicle.Vehicle;

public class VehicleAdapterImpl implements VehicleAdapter {
    private Vehicle vehicle;

    public VehicleAdapterImpl(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void accelerate() {
        vehicle.accelerate();
    }

    public void brake() {
        vehicle.brake();
    }

    public void turn() {
        vehicle.turn();
    }

    public void honk() {
        vehicle.honk();
    }

    private double convertSpeed() {
        return (vehicle.getSpeed() * 1000) / 3600;
    }

    public double getSpeed() {
        return convertSpeed();
    }
}
