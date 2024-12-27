package template_method;

public abstract class CaffeineBeverageWithHook {
    // 每个算法实现不一样，不一样的部分抽象为抽象方法
    abstract void brew();

    // 每个算法实现不一样，不一样的部分抽象为抽象方法
    abstract void addCondiments();

    void boilWater() {
        System.out.println("boiling water");
    }

    void pourInCup() {
        System.out.println("pouring into cup");
    }

    final void prepareRecipe() {
        boilWater();        // 算法里一致的部分
        brew();             // 需要具体算法定义
        pourInCup();        // 算法里一致的部分
        if (customerWantsCondiments()) { // 增加一个hook，子类来决定是否执行
            addCondiments();    // 需要具体算法定义
        }
    }

    // 子类可以重写来决定是否执行某些流程
    boolean customerWantsCondiments() {
        return true;
    }
}
