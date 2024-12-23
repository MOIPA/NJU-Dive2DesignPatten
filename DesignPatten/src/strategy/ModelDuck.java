package strategy;

import strategy.FlyBehavior.FlyNoWay;
import strategy.QuackBehavior.MuteQuack;
import strategy.QuackBehavior.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    void display() {
        System.out.println("模型鸭子 只会叫不会飞");
    }
}
