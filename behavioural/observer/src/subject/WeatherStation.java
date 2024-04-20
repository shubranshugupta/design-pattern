package subject;

import java.util.ArrayList;
import java.util.List;

import observer.Observer;

public class WeatherStation implements Subject {
    private List<Observer> observers;
    private String weatherData;

    public WeatherStation() {
        observers = new ArrayList<>();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String data) {
        for (Observer observer : observers) {
            observer.update(data);
        }
    }

    public void setWeatherData(String weatherData) {
        this.weatherData = weatherData;
        notifyObservers(weatherData);
    }

    public String getWeatherData() {
        return weatherData;
    }
}
