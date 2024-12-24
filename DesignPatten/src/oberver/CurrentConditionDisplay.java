package oberver;

import oberver.abs.DisplayElement;
import oberver.abs.MyObserver;
import oberver.abs.Subject;

import java.util.Observer;

public class CurrentConditionDisplay implements MyObserver, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject mySubject;

    public CurrentConditionDisplay(Subject subject) {
        mySubject = subject;
        mySubject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current Condition Display");
        System.out.println("Temperature: " + temperature);
        System.out.println("Humidity: " + humidity);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
