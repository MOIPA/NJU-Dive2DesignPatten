package oberver;

import oberver.abs.MyObserver;
import oberver.abs.Subject;

import java.util.ArrayList;

// 被观察者负责维护注册通知等行为
public class WeatherData implements Subject {

    private ArrayList<MyObserver> observes;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observes = new ArrayList<>();
    }

    @Override
    public void registerObserver(MyObserver o) {
        observes.add(o);
    }

    @Override
    public void removeObserver(MyObserver o) {
        observes.remove(o);
    }

    // 通知每一个观察者
    @Override
    public void notifyObservers() {
        observes.forEach(x->x.update(temperature, humidity, pressure));
    }

    // 观测到的天气真的变化的时候
    public void measurementsChanged() {
        this.notifyObservers();
    }

    // 变化天气
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}
