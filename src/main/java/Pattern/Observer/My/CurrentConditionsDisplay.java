package Pattern.Observer.My;

public class CurrentConditionsDisplay implements Observer,DisplayElement {
    private  float temperatore;
    private  float humidity;
    private  Subject weather;
    public CurrentConditionsDisplay(Subject weather){
        this.weather=weather;
        System.out.println("00000000000000000000000000000000");
        System.out.println(this.weather==weather); //true
        System.out.println(weather+"  This:"+this.weather);

        weather.registerObserever(this);
    }
    @Override
    public void display() {
        System.out.println("Current conditions:  temperature:" +temperatore+
                "Humidity :" +humidity+
                "pressure:");

    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperatore=temp;
        this.humidity=humidity;
        display();
    }
}
