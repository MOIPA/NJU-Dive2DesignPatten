package strategy.QuackBehavior;

// 嘎吱嘎吱叫
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("嘎吱嘎吱叫");
    }
}
