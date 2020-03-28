package Chap02_ObserverPattern;

import java.util.ArrayList;

public class WeatherData implements Subject{
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;
    public WeatherData(){
        observers=new ArrayList();
    }
    @Override
    public void registgerObserver(Chap02_ObserverPattern.Observer o) {
        observers.add(o);//CurrentConditionDisplay 를 ArrayList에 넣음.
    }

    @Override
    public void removeObserver(Chap02_ObserverPattern.Observer o) {
        int i=observers.indexOf(o);
        if(i>=0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for(int i=0;i<observers.size();i++){
            Chap02_ObserverPattern.Observer observer =(Chap02_ObserverPattern.Observer)observers.get(i);
            observer.update(temperature,humidity,pressure);

        }
    }
    public void measurementsChanged(){
        notifyObservers();
    }
    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementsChanged();
    }
}
