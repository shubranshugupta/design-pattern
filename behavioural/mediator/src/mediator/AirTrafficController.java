package mediator;

import flight.Airplane;

public class AirTrafficController implements Mediator {
    private boolean runwayAvailable;
    private Airplane airplaneOnRunway;

    public AirTrafficController() {
        this.runwayAvailable = true;
    }

    @Override
    public boolean isRunwayAvailable() {
        return runwayAvailable;
    }

    @Override
    public void ocupiedRunway(Airplane airplane) {
        if (runwayAvailable) {
            this.runwayAvailable = false;
            airplaneOnRunway = airplane;
            System.out.println(airplane.getName() + " is on the runway");
        } else {
            System.out.println("Runway is not available");
        }
    }

    @Override
    public void freeRunway(Airplane airplane) {
        if (airplaneOnRunway == airplane) {
            this.runwayAvailable = true;
            airplaneOnRunway = null;
            System.out.println("Runway is free");
        } else {
            System.out.println("This airplane is not on the runway");
        }
    }
}
