package state.state;



import state.GumballMachine;

class GumballMachineTest {

    GumballMachine gumballMachine = new GumballMachine(1);

    @org.junit.jupiter.api.Test
    void mytest() {
        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
    }
}