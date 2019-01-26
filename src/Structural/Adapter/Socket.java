package Structural.Adapter;

public class Socket {
    public Volt getSocketVolt(){
        return new Volt(120);
    }
}
