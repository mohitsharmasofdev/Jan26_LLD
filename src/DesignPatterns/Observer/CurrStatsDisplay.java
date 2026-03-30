package DesignPatterns.Observer;

public class CurrStatsDisplay implements Display, Observer{
    private float temperature;
    private float pressure;
    private float humidity;

    @Override
    public void display() {
        System.out.println("Current Statistics of Weather : ");
        System.out.println("Temperature : " + temperature);
        System.out.println("Pressure : "+ pressure);
        System.out.println("Humidity : " + humidity);
    }

    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        display();
    }
}
