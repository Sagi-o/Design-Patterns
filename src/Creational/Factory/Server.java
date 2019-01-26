package Creational.Factory;

public class Server extends Computer {
    public Server(int ram, int hdd) {
        super(ram, hdd);

        System.out.println("New Server Here!");
    }
}
