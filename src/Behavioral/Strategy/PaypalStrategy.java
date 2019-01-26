package Behavioral.Strategy;

public class PaypalStrategy implements PaymentStrategy {

    String email, password;

    public PaypalStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Summary for: " + email);
        System.out.println("Paid " + amount + "$ Successfully, using Paypal.\n");
    }
}
