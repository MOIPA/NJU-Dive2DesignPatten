package oberver;

import oberver.abs.DisplayElement;
import oberver.abs.MyObserver;
import oberver.abs.Subject;

public class ForecastDisplay implements MyObserver, DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    private Subject mySubject;

    public ForecastDisplay(Subject subject) {
        mySubject = subject;
        mySubject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Forecast Display");
        System.out.println("Temperature: " + temperature);
        System.out.println("Humidity: " + humidity);
        System.out.println("Pressure: " + pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
