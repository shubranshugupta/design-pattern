package mediator;

import flight.Airplane;

public interface Mediator {
    public boolean isRunwayAvailable();

    public void ocupiedRunway(Airplane airplane);

    public void freeRunway(Airplane airplane);
}
