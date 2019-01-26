package Behavioral.TemplateMethod;

public class GlassHouse extends HouseTemplate {

    public void buildWalls() {
        System.out.println("3) Glass Walls Builded.");
    }

    @Override
    void paintHouse() {
        System.out.println("House not painted.");
    }
}
