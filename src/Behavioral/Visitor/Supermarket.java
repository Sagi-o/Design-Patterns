package Behavioral.Visitor;

public class Supermarket implements Visitable {

    private int numOfProducts = 100;
    private int revenue = 1540;
    private int numOfCustomers = 400;

    @Override
    public String accept(Visitor v) {
        return v.visit(this);
    }

    @Override
    public String getName() {
        return "Supermarket";
    }

    @Override
    public int getNumOfProducts() {
        return numOfProducts;
    }

    @Override
    public int getRevenue() {
        return revenue;
    }

    @Override
    public int getNumOfCustomers() {
        return numOfCustomers;
    }
}
