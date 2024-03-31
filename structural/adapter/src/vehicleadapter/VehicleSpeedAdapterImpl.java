package vehicleadapter;

import vehicle.VehicleSpeed;

public class VehicleSpeedAdapterImpl implements VehicleSpeedAdapter {
    private VehicleSpeed vehicleSpeed;

    public VehicleSpeedAdapterImpl(VehicleSpeed vehicleSpeed) {
        this.vehicleSpeed = vehicleSpeed;
    }

    private double convertSpeed() {
        return (vehicleSpeed.getSpeed() * 1000) / 3600;
    }

    public double getSpeed() {
        return convertSpeed();
    }
}
