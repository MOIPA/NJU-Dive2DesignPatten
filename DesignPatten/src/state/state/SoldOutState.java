package state.state;

import state.GumballMachine;

public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("卖完了");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("无币可退");
    }

    @Override
    public void turnCrank() {
        System.out.println("卖完了，转也没用");
    }

    @Override
    public void dispense() {
        System.out.println("卖完了，没有可分配的");
    }
}
