package FinalProject_vendingMachine.StatePattern;

public class NoQuarter implements VMState {
    VMachine vMachine;
    public NoQuarter(VMachine vMachine) {
        this.vMachine=vMachine;
    }



    @Override
    public void insertQuarter(int money) {
        System.out.println(money+"원 입력됐습니다");
        vMachine.setState(vMachine.getHasQuarterState());

    }

    @Override
    public void ejectQuarter() {
        System.out.println("잔액이 없습니다.");
    }

    @Override
    public void chooseDrink() {
        System.out.println("잔액이 없습니다.");
    }

    @Override
    public void dispense() {
        System.out.println("잔액이 없습니다.");
    }
}
