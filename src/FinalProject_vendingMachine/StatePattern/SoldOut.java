package FinalProject_vendingMachine.StatePattern;

public class SoldOut implements VMState {

    VMachine vMachine;
    public SoldOut(VMachine vMachine) {
        this.vMachine=vMachine;
    }


    @Override
    public void insertQuarter(int money) {
        System.out.println("매진입니다");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("매진입니다");
    }

    @Override
    public void chooseDrink() {
        System.out.println("매진입니다");
    }

    @Override
    public void dispense() {
        System.out.println("매진입니다");
    }
}
