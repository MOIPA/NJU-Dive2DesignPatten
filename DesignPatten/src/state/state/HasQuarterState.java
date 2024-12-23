package state.state;

import state.GumballMachine;

public class HasQuarterState implements State {

    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("已经投币了");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("退还硬币");
        gumballMachine.setstate(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("你转动了把手");
        gumballMachine.setstate(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("未出货");
    }
}
