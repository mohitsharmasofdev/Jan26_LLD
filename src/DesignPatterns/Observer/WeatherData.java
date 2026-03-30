package DesignPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    public float temperature;
    public float pressure;
    public float humidity;
    public List<Observer> observers;

    public WeatherData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        observers = new ArrayList<>();
        measurementsChanged();
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update(temperature , pressure , humidity);
        }
        System.out.println("Observers Notified");
    }

    public void measurementsChanged(){
        // pre-computation
        System.out.println("******** Measurements Changed *********");
        notifyObservers();
    }

    public void setAttributes(float temperature , float humidity , float pressure){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        measurementsChanged();
    }
}
