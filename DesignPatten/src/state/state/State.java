package state.state;

public interface State {
    void insertQuarter(); // 插入四分之一
    void ejectQuarter(); // 弹出四分之一
    void turnCrank(); // 转动曲柄
    void dispense(); // 分配
}
