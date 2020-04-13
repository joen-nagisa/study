package Pattern.Observer.My.practice;

public interface ByObserver {
    void addObserver(Observer observer);
    void deleteObserver(Observer observer);
    void noticeObserver();
}
