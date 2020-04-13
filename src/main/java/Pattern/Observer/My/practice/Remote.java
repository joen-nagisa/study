package Pattern.Observer.My.practice;

import java.util.ArrayList;
import java.util.List;

public class Remote implements ByObserver {
    private int temperature ;
    private int humidity;
    private int presure;
    private List<Observer> list;
    Remote(){
        list = new ArrayList<>();
    }
    @Override
    public void addObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        int a = list.indexOf(observer);
        if(a>=0){
            list.remove(a);
        }
    }

    @Override
    public void noticeObserver() {
        for (Observer entry:list){
            entry.update(temperature,humidity,presure);
        }
    }
    void change(){
        noticeObserver();
    }
    void update(int a,int b,int c){
        temperature = a ;
        humidity = b;
        presure = c;
        change();
    }
}
