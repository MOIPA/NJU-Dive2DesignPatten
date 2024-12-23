package strategy;

import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;

class DuckTest {

    List<Duck> duckList = new ArrayList<>();
    Duck mallardDuck = new MallardDuck();
    Duck modelDuck = new ModelDuck();

    @BeforeEach
    void setUp() {
        duckList.add(mallardDuck);
        duckList.add(modelDuck);
    }

    @org.junit.jupiter.api.Test
    void performFly() {
        duckList.forEach(Duck::performFly);
    }

    @org.junit.jupiter.api.Test
    void performQuack() {
        duckList.forEach(Duck::performQuack);
    }

    @org.junit.jupiter.api.Test
    void swim() {
        duckList.forEach(Duck::swim);
    }

    @org.junit.jupiter.api.Test
    void display() {
        duckList.forEach(Duck::display);
    }
}