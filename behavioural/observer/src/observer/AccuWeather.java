package observer;

public class AccuWeather implements Observer {
    public void update(String data) {
        System.out.println("AccuWeather: " + data);
    }
}
