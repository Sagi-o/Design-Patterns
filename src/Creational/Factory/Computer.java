package Creational.Factory;

public abstract class Computer {
    int ram;
    int hdd;

    public Computer(int ram, int hdd) {
        this.ram = ram;
        this.hdd = hdd;
    }

    public String toString() {
        return "Ram: " + ram + ", HDD: " + hdd;
    }
}
