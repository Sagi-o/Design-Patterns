package Creational.AbstractFactory;

import Creational.Factory.Computer;
import Creational.Factory.PC;

public class PCFactory implements Creatable {

    int ram, hdd;

    public PCFactory(int ram, int hdd) {
        this.ram = ram;
        this.hdd = hdd;
    }

    @Override
    public Computer createComputer() {
        return new PC(ram, hdd);
    }
}
