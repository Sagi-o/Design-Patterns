package Structural.Adapter;

public class SocketObjectAdapterImpl implements SocketAdapter {

    // Using Composition for adapter pattern, this deafault socket needs to be injected in the constructor
    private Socket socket = new Socket();

    @Override
    public Volt get120Volt() {
        return socket.getSocketVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt v = socket.getSocketVolt();
        return convertVolt(v,10);
    }

    @Override
    public Volt get3Volt() {
        Volt v = socket.getSocketVolt();
        return convertVolt(v,40);
    }

    private Volt convertVolt(Volt v, int i) {
        return new Volt(v.getVolts()/i);
    }
}