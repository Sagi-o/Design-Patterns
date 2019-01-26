package Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class Topic implements Observable {

    private List<Observer> observers;
    private String message;

    public Topic() {
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer o) {
        if (!observers.contains(o)) {

            // Make o observe this object
            o.setObservable(this);

            // Add o to the list of subscribers
            observers.add(o);
        }
    }

    @Override
    public void unregister(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update();
        }
    }

    @Override
    public Object getUpdate(Observer o) {
        return message;
    }

    public void postMessage(String msg) {
        message = msg;
        notifyObservers();
    }
}
