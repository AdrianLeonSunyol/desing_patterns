package singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        ThreadSingleton instance = ThreadSingleton.getInstance();

        //Singleton instanceTest = new Singleton();
        System.out.print(instance);
        //System.out.println(instance.add(100, 10));

        ThreadSingleton anotherInstance = ThreadSingleton.getInstance();
        System.out.println(anotherInstance);
    }
}