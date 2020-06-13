package Chap10_StatePattern.Upgrade;

public class SoldOutState implements State {

    GumballMachine2 gumballMachine2;
    public SoldOutState(GumballMachine2 gumballMachine2) {
        this.gumballMachine2=gumballMachine2;
    }

    @Override
    public void insertQuarter() {
        System.out.println("매진입니다");

    }

    @Override
    public void ejectQuarter() {
        System.out.println("매진입니다");
    }

    @Override
    public void turnCrank() {
        System.out.println("매진입니다");
    }

    @Override
    public void dispense() {//알맹이 나옴
        System.out.println("매진입니다");
    }
}
