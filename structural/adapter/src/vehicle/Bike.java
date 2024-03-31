package vehicle;

public class Bike implements Vehicle {
    private int speed = 0;

    public void accelerate() {
        speed += 5;
    }

    public void brake() {
        speed -= 5;
    }

    public void turn() {
        System.out.println("Turning");
    }

    public void honk() {
        System.out.println("Honking");
    }

    public double getSpeed() {
        return speed;
    }
}
