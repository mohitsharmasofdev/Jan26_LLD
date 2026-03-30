package DesignPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherClient {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(10.0f, 45.0f, 32.0f);

        Observer ob1 = new CurrStatsDisplay();
        Observer ob2 = new ForecastDisplay();

        weatherData.addObserver(ob1);
        weatherData.addObserver(ob2);
//        List<Observer> observerList = new ArrayList<>();
//        observerList.add(ob1);
//        observerList.add(ob2);
//
//        weatherData.setObservers(observerList);


        weatherData.setAttributes(11.0f, 45.0f, 32.0f);

        weatherData.removeObserver(ob2);

        weatherData.setAttributes(11.0f, 45.0f, 32.0f);




    }
}
