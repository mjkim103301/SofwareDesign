package Chap10_StatePattern.Upgrade;

public class HasQuarterState implements State {
    GumballMachine2 gumballMachine2;
    public HasQuarterState(GumballMachine2 gumballMachine2) {
        this.gumballMachine2=gumballMachine2;
    }

    @Override
    public void insertQuarter() {
        System.out.println("동전은 한개만 넣으세요");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("동전이 반환됩니다");
        gumballMachine2.setState(gumballMachine2.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("손잡이를 돌렸습니다");
        gumballMachine2.setState(gumballMachine2.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("알맹이가 나갈 수 없습니다");
    }
}
