package Chap10_StatePattern.Upgrade;

public class NoQuarterState implements State {
    GumballMachine2 gumballMachine2;

    public NoQuarterState(GumballMachine2 gumballMachine2){
        this.gumballMachine2=gumballMachine2;
    }
    @Override
    public void insertQuarter() {
        System.out.println("동전을 넣었습니다");
        gumballMachine2.setState(gumballMachine2.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("동전을 넣으세요");
    }

    @Override
    public void turnCrank() {
        System.out.println("동전을 넣으세요");
    }

    @Override
    public void dispense() {
        System.out.println("동전을 넣으세요");
    }
}
