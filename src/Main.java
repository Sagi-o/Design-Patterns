import Behavioral.Observer.Subscriber;
import Behavioral.Observer.Topic;
import Behavioral.ProducerConsumer.Processor;
import Behavioral.Strategy.*;
import Behavioral.TemplateMethod.GlassHouse;
import Behavioral.TemplateMethod.WoodenHouse;
import Behavioral.Visitor.GoodsVisitor;
import Behavioral.Visitor.Store;
import Behavioral.Visitor.Supermarket;
import Behavioral.Visitor.TaxVisitor;
import Creational.AbstractFactory.ServerFactory;
import Creational.AbstractFactory._ComputerFactory;
import Creational.Builder.Car;
import Creational.Factory.Computer;
import Creational.Factory.ComputerFactory;
import Creational.Singleton.LazyInitializedSingleton;
import Structural.Adapter.SocketAdapter;
import Structural.Adapter.SocketObjectAdapterImpl;
import Structural.Adapter.Volt;
import Structural.Composite.Canvas;
import Structural.Flyweight.Oval;
import Structural.Flyweight.OvalFactory;
import Structural.Flyweight.OvalType;
import Structural.Proxy.CommandExecutorProxy;
import Structural.Proxy.Executor;

public class Main {
    public static void main(String[] args) throws Exception {
        // Enter the design pattern you want to test:
        ProducerConsumerPattern();
    }

    // Creational Patterns
    static private void SingletonPattern() {
        LazyInitializedSingleton.getInstance();

        // Gets the currently existing instance
        LazyInitializedSingleton.getInstance();
    }

    static private void BuilderPattern() {
        Car car = new Car.CarBuilder(100, 1).setHybrid(true).setTurbo(true).build();
        System.out.println(car.toString());
    }

    static private void FactoryPattern() {
        Computer c = ComputerFactory.createComputer("pc", 90, 80);
        System.out.println(c.toString());
    }

    static private void AbstractFactoryPattern() {
        Computer c = _ComputerFactory.createComputer(new ServerFactory(8, 512));
        System.out.println(c.toString());
    }

    // Structural Patterns
    static private void AdapterPattern() {
        SocketAdapter adapter = new SocketObjectAdapterImpl();

        Volt originaVolt = adapter.get120Volt();
        Volt v3 = adapter.get3Volt();
    }

    static private void CompositePattern() {
        Canvas canvas = new Canvas();

        canvas.addCircle("Red");
        canvas.addTriangle("Black");
        canvas.addTriangle("Cyan");

        canvas.print();

        // Draw all Objects in the canvas, although they are different
        canvas.draw("Yellow");

        canvas.print();
    }

    static private void ProxyPattern() throws Exception {
        // Try user name: "admin" / "user" (with password "123")
        // Try another username, see the difference
        // The proxy pattern will handle every case

        Executor commandExecutor = new CommandExecutorProxy("user", "123");
        commandExecutor.runCommand("Shutdown Computer");
    }

    static private void FlyweightPattern() {
        OvalFactory factory = new OvalFactory();

        // 1
        Oval dots = factory.getOval(OvalType.WITH_DOTS);

        // 2
        Oval border = factory.getOval(OvalType.WITH_BORDER);

        // 3
        Oval fill = factory.getOval(OvalType.WITH_FILL);

        // 4
        Oval fill_2 = factory.getOval(OvalType.WITH_FILL);

        System.out.println(dots.getType());
        System.out.println(border.getType());
        System.out.println(fill.getType());

        System.out.println("Number of ovals is: " + factory.getNumberOfOvals());
    }

    // Behavioral Patterns
    static private void TemplateMethodPattern() {
        WoodenHouse woodenHouse = new WoodenHouse();
        woodenHouse.buildHouse();

        System.out.println();

        GlassHouse glassHouse = new GlassHouse();
        glassHouse.buildHouse();
    }

    static private void VisitorPattern() {
        Supermarket supermarket = new Supermarket();
        Store store = new Store();

        String supermarketTaxSummary = supermarket.accept(new TaxVisitor());
        String storeTaxSummary = store.accept(new TaxVisitor());

        String supermarketGoodsSummary = supermarket.accept(new GoodsVisitor());
        String storeGoodsSummary = store.accept(new GoodsVisitor());

        System.out.println(storeTaxSummary + "\n" + supermarketTaxSummary + "\n");
        System.out.println(storeGoodsSummary + "\n" + supermarketGoodsSummary);
    }

    static private void ObserverPattern() {
        Subscriber john = new Subscriber("John");
        Subscriber david = new Subscriber("David");
        Subscriber mark = new Subscriber("Mark");

        Topic sport = new Topic();
        Topic news = new Topic();

        sport.register(john);
        sport.register(david);
        news.register(mark);

        sport.postMessage("New Goal for Barcelona!");
        news.postMessage("Trump has won the Elections!");
    }

    static private void StrategyPattern() {
        ShoppingCart cart = new ShoppingCart();
        ShoppingCart cart2 = new ShoppingCart();

        PaymentStrategy Paypal = new PaypalStrategy("xyz@gmail.com", "123456");
        PaymentStrategy CreditCard = new CreditCardStrategy("David Cohen", 788090020);

        Item item = new Item("iPhone", 1000);
        Item item2 = new Item("Leather Wallet", 25);
        Item item3 = new Item("Marshall Speakers", 230);
        Item item4 = new Item("iPad Case", 80);
        Item item5 = new Item("Tie", 75);

        cart.addItem(item);
        cart.addItem(item2);

        cart2.addItem(item3);
        cart2.addItem(item4);
        cart2.addItem(item5);

        // "Paying" using Interfaces Polymorphism. Paypal and CreditCard implements the PaymentStrategy interface
        cart.pay(Paypal);
        cart2.pay(CreditCard);
    }

    static private void ProducerConsumerPattern() throws InterruptedException {
        final Processor processor = new Processor();

        Thread t1 = new Thread(() -> {
            try {
                processor.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                processor.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
