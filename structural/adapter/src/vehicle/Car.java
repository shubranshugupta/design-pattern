package vehicle;

public class Car implements Vehicle {
    private int speed = 0;

    public void accelerate() {
        speed += 10;
    }

    public void brake() {
        speed -= 10;
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
