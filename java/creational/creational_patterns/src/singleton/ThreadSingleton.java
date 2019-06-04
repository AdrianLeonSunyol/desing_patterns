package singleton;

public class ThreadSingleton {
    private static volatile ThreadSingleton instance = null;

    /**
     * Solution for reflection
     */
    private ThreadSingleton () {
        if (instance != null) {
            throw new RuntimeException("Use getInstance() mehtod to create"); 
        }
    }

    /**
     * Solution for multithreading problem
     */
    public static ThreadSingleton getInstance() {
        if (instance == null) {
            synchronized(ThreadSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSingleton();
                }
            }
        }
        
        return instance;
    }
}