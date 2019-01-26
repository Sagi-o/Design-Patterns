package Creational.Factory;

public class PC extends Computer {

    int gCard;

    public PC(int ram, int hdd) {
        super(ram, hdd);
        System.out.println("New PC Here!");
    }
}
