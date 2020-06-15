package FinalProject_vendingMachine.StatePattern;

public class HasQuarter implements VMState {
    VMachine vMachine;
    public HasQuarter(VMachine vMachine){
        this.vMachine=vMachine;
    }
    @Override
    public void insertQuarter(int money) {
        System.out.println(money+"를 넣었습니다.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("동전을 반환합니다.");
        vMachine.setState(vMachine.getNoQuarterState());
    }

    @Override
    public void chooseDrink() {
        System.out.println("음료를 선택했습니다.");
    }

    @Override
    public void dispense() {
        System.out.println("음료를 고르세요");
    }
}
