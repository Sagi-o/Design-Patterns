package Behavioral.TemplateMethod;

public class WoodenHouse extends HouseTemplate {

    @Override
    public void buildWalls() {
        System.out.println("3) Wooden Walls Builded.");
    }

    @Override
    void paintHouse() {
        System.out.println("House painted in Brown.");
    }
}
