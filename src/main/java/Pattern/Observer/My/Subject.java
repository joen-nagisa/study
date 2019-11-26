package Pattern.Observer.My;

public interface Subject {
    public void registerObserever(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
