package Structural.Adapter;

public class SocketAdapterClassImpl extends Socket implements SocketAdapter {

    @Override
    public Volt get120Volt() {
        return getSocketVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt volt = getSocketVolt();
        return convertVolt(volt, 10);
    }

    @Override
    public Volt get3Volt() {
        Volt volt = getSocketVolt();
        return convertVolt(volt, 40);
    }

    private Volt convertVolt(Volt v, int divider) {
        return new Volt(v.getVolts()/divider);
    }
}
