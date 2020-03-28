package Chap02_ObserverPattern;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements  Observer, DisplayElement {
    private float currentPressure=29.92f;
    private float lastPressure;
    public ForecastDisplay(Observable observable){
        observable.addObserver(this);

    }


    @Override
    public void display() {
        System.out.println("Current pressure: "+currentPressure+" and Last pressure is "+lastPressure);
    }

    @Override
    public void update(Observable observable, Object o) {
        if(observable instanceof WeatherData2){
            WeatherData2 weatherData2=(WeatherData2)observable;
            lastPressure=currentPressure;
            currentPressure=weatherData2.getPressure();
            display();
        }


    }
}
