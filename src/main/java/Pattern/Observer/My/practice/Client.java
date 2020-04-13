package Pattern.Observer.My.practice;

public class Client implements Observer,Display{
    private int temperature;
    private int humidity;
    private int pressure;
    private ByObserver remote;
    Client(ByObserver byObserver){
        remote = byObserver;
        remote.addObserver(this);
    }

    @Override
    public void update(int a, int b, int c) {
        temperature = a;
        humidity = b;
        pressure = c;
        display();
    }

    @Override
    public void display() {
        System.out.println("this temperature:"+temperature+" humidity:"+humidity+" pressure:"+pressure);
    }
}
