package FinalProject_vendingMachine.StatePattern;

import FinalProject_vendingMachine.VMachineGUI;

public class SoldOut implements VMState {

    VMachine vMachine;
    public SoldOut(VMachine vMachine) {
        this.vMachine=vMachine;
    }


    @Override
    public void insertQuarter(int money) {
        VMStateAL.add("매진입니다.");
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
