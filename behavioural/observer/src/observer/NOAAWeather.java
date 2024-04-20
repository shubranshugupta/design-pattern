package observer;

public class NOAAWeather implements Observer {
    public void update(String data) {
        System.out.println("NOAAWeather: " + data);
    }
}
