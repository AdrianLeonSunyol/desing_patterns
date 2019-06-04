package singleton;

public class lazySingleton {
    private static lazySingleton instance = null;

    private lazySingleton () {}

    /**
     * problems with multithreading -> solution 
     * @return
     */
    public static lazySingleton getInstance () {
        if (instance == null)
            instance = new lazySingleton();
        return instance;
    }
}