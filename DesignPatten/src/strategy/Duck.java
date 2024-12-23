package strategy;

import strategy.FlyBehavior.FlyBehavior;
import strategy.QuackBehavior.QuackBehavior;

// 鸭子父类
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    void performFly() {
        flyBehavior.fly();
    }
    void performQuack() {
        quackBehavior.quack();
    }
    void swim(){
        System.out.println("all ducks are swimming");
    }
    void display() {}

    void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }
    void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}
