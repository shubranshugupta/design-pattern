package flight;

import mediator.Mediator;

public class Boeing747 implements Airplane {
    Mediator mediator;
    String name;

    public Boeing747(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    @Override
    public void land() {
        if (mediator.isRunwayAvailable()) {
            System.out.println("Boeing747 is waiting to land");
        }
        mediator.ocupiedRunway(this);
    }

    @Override
    public void takeoff() {
        if (!mediator.isRunwayAvailable()) {
            System.out.println("Boeing747 is waiting to take off");
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
