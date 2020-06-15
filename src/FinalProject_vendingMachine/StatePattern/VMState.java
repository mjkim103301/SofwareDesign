package FinalProject_vendingMachine.StatePattern;

public interface VMState {
    void insertQuarter(int money);//동전 입력
    void ejectQuarter();//동전반환
    void chooseDrink();//음료 선택하기
    void dispense();//음료 반환
}
