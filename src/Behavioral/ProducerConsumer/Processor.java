package Behavioral.ProducerConsumer;

import java.util.LinkedList;
import java.util.Random;

public class Processor {

    private LinkedList<Integer> list = new LinkedList<>();
    private final int LIMIT = 10;
    private final Object lock = new Object();

    public void produce() throws InterruptedException {
        synchronized (lock) {
            /*
            System.out.println("Producer: In produce ....");
            System.out.println("Producer: Releasing my lock, gives the consumer to consume....");
            wait();
            System.out.println("Producer: Came back from lock. I am here to produce again, consumer released lock");
            */

            while (true) {
                while (list.size() == LIMIT) {
                    // When list is full Give the consumer to consume
                    System.out.println("Producer: I have produced " + LIMIT + " numbers. Giving the consumer to consume them ...");
                    lock.wait();
                    // Wait, don't proceed until you got notify
                }

                // Else, add integers to list
                Random rand = new Random();
                int num = rand.nextInt(50);
                list.add(num);

                System.out.println("Producer: I have produced new number: " + num);

                // Notify consumer to consume
                lock.notify();

                Thread.sleep(200);
            }
        }
    }

    public void consume() throws InterruptedException {
        Thread.sleep(2000);
        synchronized (lock) {
            /*
            System.out.println("Consumer: In consume ....");
            Thread.sleep(2000);
            notify();
            System.out.println("Consumer: Notified that consumed, releasing the lock for the producer");
            */

            while (true) {
                while (list.size() == 0) {
                    // When list is empty, give the producer to produce new numbers
                    System.out.println("Consumer: I have emptied the list. Giving the producer to produce some numbers ...");
                    //lock.notify();
                    lock.wait();
                    // Wait, don't proceed until you got notified
                }

                // Else, remove/consume numbers from list
                int num = list.removeFirst();

                System.out.println("Consumer: I have consumed the number: " + num);

                // Notify producer to produce
                lock.notify();

                Thread.sleep(500);
            }
        }
    }
}
