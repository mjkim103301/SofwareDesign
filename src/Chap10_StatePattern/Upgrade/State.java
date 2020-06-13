package Chap10_StatePattern.Upgrade;

public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
