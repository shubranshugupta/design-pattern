import vehicle.*;
import vehicleadapter.*;

public class MainClass {
    public static void main(String[] args) {
        Vehicle car = new Car();
        VehicleAdapter vehicleAdapter = new VehicleAdapterImpl(car);
        vehicleAdapter.accelerate();
        vehicleAdapter.accelerate();
        vehicleAdapter.accelerate();

        System.out.println("Speed in km/hr: " + car.getSpeed());
        System.out.println("Speed in m/s: " + vehicleAdapter.getSpeed());
    }
}
