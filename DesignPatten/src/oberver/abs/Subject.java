package oberver.abs;

public interface Subject {
    void registerObserver(MyObserver o);
    void removeObserver(MyObserver o);
    void notifyObservers();
}
