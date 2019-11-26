package Pattern.Observer.My;

public class Demo {
    public static void main(String[] args) {
        WeatherData weatherData=new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay=new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(35f,11f,10.0f);
        weatherData.setMeasurements(1f,2f,3f);

    }
}
