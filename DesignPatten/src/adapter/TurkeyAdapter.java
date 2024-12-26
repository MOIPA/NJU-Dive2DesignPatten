package adapter;


import adapter.turkey_and_duck.Duck;
import adapter.turkey_and_duck.Turkey;

// 我希望火鸡能像鸭子一样使用
public class TurkeyAdapter implements Duck {

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        this.turkey.gobble();
    }

    @Override
    public void fly() {
        // 火鸡只能飞一会，多飞几次才能到达鸭子的水平
        for (int i = 0; i < 5; i++) {
            this.turkey.fly();
        }
    }
}
