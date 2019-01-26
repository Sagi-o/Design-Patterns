package Creational.Factory;

public class ComputerFactory {
    public static Computer createComputer(String type, int ram, int hdd) {
        if (type.equalsIgnoreCase("pc")) {
            return new PC(ram, hdd);
        } else if (type.equalsIgnoreCase("server")) {
            return new Server(ram, hdd);
        }
        return null;
    }
}
