package Chap02_ObserverPattern;

import java.util.Observable;
import java.util.Observer;
public class CurrentConditionsDisplay2 implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private  float humidity;
    @Override
    public void display() {
        System.out.println("Current conditions: "+temperature+"F degrees amd "+humidity+"% humidity");
    }

    @Override
    public void update(java.util.Observable observable, Object o) {
        if(observable instanceof WeatherData2){
            WeatherData2 weatherData2=(WeatherData2) observable;
            this.temperature=weatherData2.getTemperature();
            this.humidity=weatherData2.getHumidity();
            display();
        }
    }
}
