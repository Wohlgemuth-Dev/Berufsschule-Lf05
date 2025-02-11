package singleton;


public class Programm {
    public static void main(String[] args) {
        Singleton ad = Singleton.createSingleton();
        ad.testInt = 50;
        Singleton ad2 = Singleton.createSingleton();
        System.out.println(ad2.testInt);
    }
}
