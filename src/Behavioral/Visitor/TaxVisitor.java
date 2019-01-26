package Behavioral.Visitor;

public class TaxVisitor implements Visitor {
    @Override
    public String visit(Visitable v) {
        final double taxRatio = 0.3;
        final double productTax = 0.05;

        double revenueTax = v.getRevenue() * taxRatio;
        double reveuePerProduct =  v.getNumOfProducts() * productTax;
        String name = v.getName();

        return "Taxes summary for: " + name + " | Revenue fees: " + revenueTax  + "$, Product fees: " + reveuePerProduct + "$";
    }
}
