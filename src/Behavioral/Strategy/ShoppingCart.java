package Behavioral.Strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> items;
    private String itemsList = "";
    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(Item i) {
        items.add(i);
    }

    public void removeItem(Item i) {
        items.remove(i);
    }

    public double calculateTotal() {
        if (!items.isEmpty()) {
            double total = 0;
            itemsList = "";
            for (Item i : items) {
                total += i.getCost();
                itemsList += i.getName() + ", ";
            }
            itemsList = itemsList.substring(0, itemsList.length()-2);
            return total;
        } else {
            return 0;
        }
    }

    // Strategy pattern use
    public void pay(PaymentStrategy paymentMethod) {
        double amount = calculateTotal();

        System.out.println("On Shopping Cart: " + itemsList);
        paymentMethod.pay(amount);
    }
}
