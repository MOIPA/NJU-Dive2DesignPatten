package state.state;

import state.GumballMachine;

public class SoldState implements State {
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("不要投币，正在出货请等待");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("你已经转动了把手");
    }

    @Override
    public void turnCrank() {
        System.out.println("再转动把手也不会再给你另一个口香糖");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        // 判断有没有卖完
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setstate(gumballMachine.getNoQuarterState());
        }else{
            System.out.println("卖完了");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
