package FinalProject_vendingMachine.StatePattern;

public class VMachine {
    VMState hasQuarterState;
    VMState noQuarterState;
    VMState soldState;
    VMState soldOutState;

    VMState vmState=soldOutState;
    int drinkCount=0;//음료수 총 개수
    int money=0;//입력한 돈
    public VMachine(int count){
        hasQuarterState=new HasQuarter(this);
        noQuarterState=new NoQuarter(this);
        soldState=new Sold(this);
        soldOutState=new SoldOut(this);
        this.drinkCount=count;
        if(drinkCount>0){
            vmState=noQuarterState;
        }

    }
    public void insertQuarter(int money){
        this.money+=money;
        vmState.insertQuarter(money);
        System.out.println("잔액: "+getMoney());
    }
    public void ejectQuarter(){
        vmState.ejectQuarter();
    }
    public void chooseDrink(){
        vmState.chooseDrink();
        vmState.dispense();
    }
    void setState(VMState vmState){
        this.vmState=vmState;
    }
    public void releaseDrink(){
        System.out.println("음료수 출력");
        if(drinkCount!=0){
            drinkCount-=1;
        }
        if(money>0){
            money-=500;
        }
    }
    public String toString(){
        String temp="\n수제 음료수 자판기\n 남은 금액:"+getMoney()+"\n";
        return temp;
    }
    public VMState getHasQuarterState(){return hasQuarterState;}
    public VMState getNoQuarterState(){return noQuarterState;}
    public VMState getSoldState(){return soldState;}
    public VMState getSoldOutState(){return soldOutState;}

    public int getCount(){return drinkCount;}
    public int getMoney(){return money;}


}
