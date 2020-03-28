package Chap02_ObserverPattern;

public class WeatherStation {
    public static void main(String[] args){
        //WeatherData2 weatherData=new WeatherData2();
       WeatherData weatherData=new WeatherData();
        CurrentConditionsDisplay currentDisplay=new CurrentConditionsDisplay(weatherData);
       // ForecastDisplay forecastDisplay=new ForecastDisplay();
        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(82,70,29.2f);
        weatherData.setMeasurements(78,90,39.4f);
    }
}
