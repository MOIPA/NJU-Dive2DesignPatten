package oberver.observer_java_build_in;

import oberver.abs.DisplayElement;

import javax.print.attribute.standard.JobMediaSheetsSupported;
import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {

    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            temperature = weatherData.getTemperature();
            humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current Condition Display");
        System.out.println("Temperature: " + temperature);
        System.out.println("Humidity: " + humidity);
    }
}
