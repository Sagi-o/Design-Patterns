package Behavioral.Observer;

public class Subscriber implements Observer {

    String name;
    Observable topic;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        if (topic != null) {
            String message = (String) topic.getUpdate(this);
            if (message != null) System.out.println("Message recieved for " + name + ": " + message);
        } else {
            System.out.println(name + " Has not registered to this topic, please register and try again to get updates.");
        }
    }

    @Override
    public void setObservable(Observable o) {
        topic = o;
    }
}
