package Pattern.Observer.My;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList<Observer> list;
    private float temperature;
    private float humidity;
    private float pressure;

    WeatherData(){
        list = new ArrayList<Observer>();
    }

    @Override
    public void registerObserever(Observer o) {
        list.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        //list.remove(o);   list里面是Integer，那么当remove(1) 的时候就会造成误解
        int a=list.indexOf(o);
        if (a >= 0){
            list.remove(a);
        }
    }

    @Override
    public void notifyObserver() {
        for (int i=0;i<list.size();i++){
            Observer observer=list.get(i);
            observer.update(temperature,humidity,pressure);
        }
    }

    public void measurementsChanged(){
        notifyObserver();
    }

    public void setMeasurements(Float temperature,float humidity,float pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementsChanged();
    }
    //Weather的其他方法
}
