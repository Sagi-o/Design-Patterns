package Behavioral.Visitor;

public class GoodsVisitor implements Visitor {

    @Override
    public String visit(Visitable v) {
        int revenuePerCustomer = v.getRevenue() / v.getNumOfCustomers();
        int reveuePerProduct = v.getRevenue() / v.getNumOfProducts();
        String name = v.getName();

        return "Goods summary for: " + name + " | Revenue per customer: " + revenuePerCustomer
                + "$, Revenue per product: " + reveuePerProduct + "$";
    }
}
