package state.state;

import state.GumballMachine;

public class NoQuarterState implements State {

    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }


    @Override
    public void insertQuarter() {
        System.out.println("你投入了一枚硬币");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("你还没投币呢");
    }

    @Override
    public void turnCrank() {
        System.out.println("你还没投币呢");
    }

    @Override
    public void dispense() {
        System.out.println("得先付钱");
    }
}
