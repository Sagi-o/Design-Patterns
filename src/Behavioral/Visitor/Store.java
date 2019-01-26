package Behavioral.Visitor;

public class Store implements Visitable {

    private int numOfProducts = 80;
    private int revenue = 2200;
    private int numOfCustomers = 560;

    @Override
    public String accept(Visitor v) {
        return v.visit(this);
    }

    @Override
    public String getName() {
        return "Store";
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
