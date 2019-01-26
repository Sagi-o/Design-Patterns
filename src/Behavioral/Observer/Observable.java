package Behavioral.Observer;

public interface Observable {
    void register(Observer o);
    void unregister(Observer o);
    void notifyObservers();
    Object getUpdate(Observer o);
}
