package Behavioral.Strategy;

public class Item {
    private int cost;
    private String name;

    public Item(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }
    public String getName() {
        return name;
    }
}
