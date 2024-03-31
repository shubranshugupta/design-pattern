import vehicle.*;
import vehicleadapter.*;

public class MainClass {
    public static void main(String[] args) {
        VehicleSpeed car = new CarSpeed();
        VehicleSpeedAdapter vehicleSpeedAdapter = new VehicleSpeedAdapterImpl(car);

        System.out.println("Speed in km/hr: " + car.getSpeed());
        System.out.println("Speed in m/s: " + vehicleSpeedAdapter.getSpeed());
    }
}
