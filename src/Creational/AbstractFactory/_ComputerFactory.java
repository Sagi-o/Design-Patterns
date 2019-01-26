package Creational.AbstractFactory;

import Creational.Factory.Computer;

public class _ComputerFactory {
    public static Computer createComputer(Creatable factory) {
        return factory.createComputer();
    }
}
