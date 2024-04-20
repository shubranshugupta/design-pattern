import flight.*;
import mediator.*;

public class MainClass {
    public static void main(String[] args) throws Exception {
        Mediator mediator = new AirTrafficController();
        Airplane airbusA380 = new AirbusA380(mediator, "AirbusA380");
        Airplane boeing747 = new Boeing747(mediator, "Boeing747");

        airbusA380.land();
        boeing747.land();
        boeing747.freeRunway();
        airbusA380.freeRunway();
        boeing747.land();
        airbusA380.takeoff();
    }
}
