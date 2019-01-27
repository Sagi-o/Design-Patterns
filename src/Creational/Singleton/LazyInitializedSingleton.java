package Creational.Singleton;

// Thread safe also
public class LazyInitializedSingleton {
    // Volatile -> use instance just if it fully initialized.
    // Helps the problem when another thread wants to use the instance but it is not fully initialized
    private static volatile LazyInitializedSingleton instance;

    private LazyInitializedSingleton() {}

    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {
            synchronized (LazyInitializedSingleton.class) {
                if (instance == null) {
                    instance = new LazyInitializedSingleton();
                    System.out.println("Singleton created successfully.");
                }
            }
        } else {
            System.out.println("Singleton is already created. Returned existing object.");
        }
        return instance;
    }
}
