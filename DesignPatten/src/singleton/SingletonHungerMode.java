package singleton;

public class SingletonHungerMode {
    private static SingletonHungerMode instance = new SingletonHungerMode();

    private SingletonHungerMode(){}

    // 也是多线程安全的
    public static SingletonHungerMode getInstance(){
        return instance;
    }
}
