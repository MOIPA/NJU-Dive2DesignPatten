package strategy;

import strategy.FlyBehavior.FlyWithWings;
import strategy.QuackBehavior.Quack;

// 普通鸭子：绿头鸭
public class MallardDuck extends Duck {
    public MallardDuck() {
        this.quackBehavior = new Quack();
        this.flyBehavior = new FlyWithWings();
    }

    @Override
    void display() {
        System.out.println("I'm a mallard duck");
    }
}
