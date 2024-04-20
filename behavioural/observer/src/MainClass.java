import observer.AccuWeather;
import observer.NOAAWeather;
import subject.WeatherStation;

public class MainClass {
    public static void main(String[] args) throws Exception {
        WeatherStation weatherStation = new WeatherStation();
        AccuWeather accuWeather = new AccuWeather();
        NOAAWeather noaaWeather = new NOAAWeather();
        weatherStation.registerObserver(accuWeather);
        weatherStation.registerObserver(noaaWeather);

        weatherStation.setWeatherData("Temperature: 25");
        weatherStation.removeObserver(noaaWeather);
        weatherStation.setWeatherData("Temperature: 35");
    }
}
