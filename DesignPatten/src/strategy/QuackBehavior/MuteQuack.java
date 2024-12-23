package strategy.QuackBehavior;

// 哑巴
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("哑巴");
    }
}
