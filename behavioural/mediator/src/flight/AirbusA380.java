package flight;

import mediator.Mediator;

public class AirbusA380 implements Airplane {
    Mediator mediator;
    String name;

    public AirbusA380(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    @Override
    public void land() {
        if (!mediator.isRunwayAvailable()) {
            System.out.println("AirbusA380 is waiting to land");
        }
        mediator.ocupiedRunway(this);
    }

    @Override
    public void takeoff() {
        if (!mediator.isRunwayAvailable()) {
            System.out.println("AirbusA380 is waiting to take off");
        }
        mediator.ocupiedRunway(this);
    }

    @Override
    public void freeRunway() {
        mediator.freeRunway(this);
    }

    public String getName() {
        return name;
    }
}
