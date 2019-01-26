package Behavioral.Visitor;

public interface Visitable {
    String accept(Visitor v);

    // In real life scenario, only above method will be implemented it this interface
    // The below methods are just for the example
    String getName();
    int getNumOfProducts();
    int getRevenue();
    int getNumOfCustomers();
}
