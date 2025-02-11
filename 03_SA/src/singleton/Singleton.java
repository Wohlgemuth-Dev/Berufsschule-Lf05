
package singleton;

public class Singleton {
    private static Singleton instance;
    public int testInt = 0;

    private Singleton() {

    }

    public static Singleton createSingleton() {
        if (instance == null)
        {
            instance = new Singleton();
        }
        return instance;
    }
}
