package Creational.AbstractFactory;

import Creational.Factory.Computer;
import Creational.Factory.Server;

public class ServerFactory implements Creatable {

    int ram, hdd;

    public ServerFactory(int ram, int hdd) {
        this.ram = ram;
        this.hdd = hdd;
    }

    @Override
    public Computer createComputer() {
        return new Server(ram, hdd);
    }
}
