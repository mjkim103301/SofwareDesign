package FinalProject_vendingMachine.StatePattern;

public class Sold implements VMState {
    VMachine vMachine;
    public Sold(VMachine vMachine) {
        this.vMachine=vMachine;
    }



    @Override
    public void insertQuarter(int money) {
        System.out.println("음료가 나가고 있습니다.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("음료가 나올 때까지 기다려 주세요");
    }

    @Override
    public void chooseDrink() {
        System.out.println("음료가 나올 때까지 기다려주세요");
    }

    @Override
    public void dispense() {
        vMachine.releaseDrink();
        if(vMachine.getCount()>0){
            if(vMachine.getMoney()>0){
                vMachine.setState(vMachine.getHasQuarterState());
            }else{
                vMachine.setState(vMachine.getNoQuarterState());
            }

        }else{
            System.out.println("음료가 나왔습니다");
            vMachine.setState(vMachine.getSoldOutState());
        }
    }
}
