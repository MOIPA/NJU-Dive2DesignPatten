package adapter;

import adapter.turkey_and_duck.Duck;
import adapter.turkey_and_duck.MallardDuck;
import adapter.turkey_and_duck.Turkey;
import adapter.turkey_and_duck.WildTurkey;
import org.junit.jupiter.api.Test;

class TurkeyAdapterTest {
    @Test
    public void run(){
        Duck mallardDuck = new MallardDuck();
        Turkey turkey = new WildTurkey();
        Duck adapter = new TurkeyAdapter(turkey);
        adapter.fly();
        adapter.quack();
    }
}