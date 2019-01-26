package Behavioral.TemplateMethod;

public abstract class HouseTemplate {

    public final void buildHouse() {
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        paintHouse();
    }

    private void buildFoundation() {
        System.out.println("1) Foundation Builded.");
    }

    private void buildPillars() {
        System.out.println("2) Pillars Builded.");
    }

    public void buildWalls() {
        System.out.println("3) Walls Builded.");
    }

    private void buildWindows() {
        System.out.println("4) Windows Builded.");
    }

    abstract void paintHouse();
}
