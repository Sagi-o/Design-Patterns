package Behavioral.Strategy;

public class CreditCardStrategy implements PaymentStrategy {

    private int cardNumber;
    private String name;

    public CreditCardStrategy(String name, int cardNumber) {
        this.cardNumber = cardNumber;
        this.name = name;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Summary for: " + name);
        System.out.println("Card No. " + cardNumber + " Paid " + amount + "$ Successfully, using Credit Card.\n");
    }
}
