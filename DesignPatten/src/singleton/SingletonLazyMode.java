package singleton;

public class SingletonLazyMode {
    // 使用volatile来减少synchronized的使用
    //可见性：保证了不同线程对这个变量进行操作时的可见性。也就是说，当一个线程修改了被volatile修饰的变量的值，新值会立即对其他线程可见。
    //禁止指令重排序：编译器和处理器在对指令进行重排序时，会考虑到volatile变量的顺序。在一定程度上保证了代码的执行顺序符合程序的逻辑顺序。
    private volatile static SingletonLazyMode instance;

    private SingletonLazyMode() {
    }

    // 多线程
    public static SingletonLazyMode getInstance() {
        if (instance == null) {  // 使用这个是为了效率，不然直接进函数的synchronized效率太低
            synchronized (SingletonLazyMode.class) {
                if (instance == null) {
                    instance = new SingletonLazyMode();
                }
            }
        }
        return instance;
    }
}
