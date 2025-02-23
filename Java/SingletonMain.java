package Java;

class Singleton {
    private static Singleton instance = null;

    public String s;

    private Singleton() {
        s = "Private constructor of singleton class";
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

public class SingletonMain {
    public static void main(String[] args) {
        Singleton firstInstance = Singleton.getInstance();
        Singleton secondInstance = Singleton.getInstance();
        Singleton thirdInstance = Singleton.getInstance();
        Singleton fourthInstance = Singleton.getInstance();

        System.out.println(firstInstance.hashCode());
        System.out.println(secondInstance.hashCode());
        System.out.println(thirdInstance.hashCode());
        System.out.println(fourthInstance.hashCode());
    }
}
