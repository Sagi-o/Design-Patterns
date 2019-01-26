package Creational.Singleton;

// Thread safe also
public class LazyInitializedSingleton {
    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton() {}

    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {
            synchronized (LazyInitializedSingleton.class) {
                instance = new LazyInitializedSingleton();
                System.out.println("Singleton created successfully.");
            }
        } else {
            System.out.println("Singleton is already created. Returned existing object.");
        }
        return instance;
    }
}
