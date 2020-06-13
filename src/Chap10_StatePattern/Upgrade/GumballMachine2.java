package Chap10_StatePattern.Upgrade;

public class GumballMachine2 {
   State soldOutState;
   State noQuarterState;
   State hasQuarterState;
   State soldState;

   State state=soldOutState;
   int count=0;//알맹이 개수


    public GumballMachine2(int count){
        soldOutState=new SoldOutState(this);
        noQuarterState=new NoQuarterState(this);
        hasQuarterState=new HasQuarterState(this);
        soldState=new SoldState(this);

        this.count=count;
        if(count>0){
            state=noQuarterState;
        }
    }

    public void insertQuarter(){
       state.insertQuarter();
    }
    public void ejectQuarter(){//동전반환
        state.ejectQuarter();
    }
    public void turnCrank(){//손잡이 돌리는 경우
        state.turnCrank();
        state.dispense();//알맹이 꺼내기
    }
    void setState(State state){
        this.state=state;
    }
    void releaseBall(){
        System.out.println("A gumball comes rolling out the slot");
        if(count!=0){
            count=count-1;
        }
    }
    public String toString(){
        String temp="\n주식회사 왕뽑기 \n"+"남은 알맹이 개수: "+count+"\n";
       return temp;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public int getCount() {
        return count;
    }
}
