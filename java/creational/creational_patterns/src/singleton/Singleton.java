package singleton;

public class Singleton {
    private static Singleton instance = new Singleton();
    private Singleton () {}

    public static Singleton getInstance () {
        return instance;
    }

    public int add (int n1, int n2) {
        return n1 + n2;
    }

    /**
     * Problems:
     * Reflection
     * Serialization
     * Class loaders
     * Best options for recent versions of java is with a enum
     */
    /**
     *  public enum Singleton {
     *      instance;
     *      public int add (int n1, int n2) {
     *          return n1 + n2;
     *      }
     *  }
     *  But enumeration can not extend from another class: 
     *  So this solution is only viable as long as you don't need
     *  to extend from another class. 
     */
}