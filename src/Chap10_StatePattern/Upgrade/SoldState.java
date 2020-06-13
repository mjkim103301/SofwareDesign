package Chap10_StatePattern.Upgrade;

public class SoldState implements State {
    GumballMachine2 gumballMachine2;
    public SoldState(GumballMachine2 gumballMachine2) {
        this.gumballMachine2=gumballMachine2;
    }

    @Override
    public void insertQuarter() {
        System.out.println("알맹이가 나가고 있습니다");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("이미 알맹이를 뽑았습니다");
    }

    @Override
    public void turnCrank() {
        System.out.println("손잡이는 한번만 돌려주세요");
    }

    @Override
    public void dispense() {
        gumballMachine2.releaseBall();
        if(gumballMachine2.getCount()>0){
            gumballMachine2.setState(gumballMachine2.getNoQuarterState());
        }else{
            System.out.println("알맹이가 나왔습니다");
            gumballMachine2.setState(gumballMachine2.getSoldOutState());
        }

    }
}
