package Chap10_StatePattern;

public class GumballMachine {
    final static int SOLD_OUT=0;//알맹이 매진
    final static int NO_QUARTER=1;//동전없음
    final static int HAS_QUARTER=2;//동전있음
    final static int SOLD=3;//알맹이 판매

    int state=SOLD_OUT;
    int count=0;//알맹이 개수

    public GumballMachine(int count){
        this.count=count;
        if(count>0){
            state=NO_QUARTER;
        }
    }

    public void insertQuarter(){
        if(state==HAS_QUARTER){
            System.out.println("동전은 한개만 넣어주세요");
        }
        else if(state==NO_QUARTER){
            state=HAS_QUARTER;
            System.out.println("동전을 넣었습니다.");
        }else if(state==SOLD_OUT){
            System.out.println("매진됐습니다. 다음 기회에");
        }
        else if(state==SOLD){
            System.out.println("기다려주세요. 알맹이가 나가고 있습니다");
        }
    }
    public void ejectQuarter(){//동전반환
        if(state==HAS_QUARTER){
            System.out.println("동전이 반환됩니다");
            state=NO_QUARTER;
        }
        else if(state==NO_QUARTER){
            //state=HAS_QUARTER;
            System.out.println("동전을 넣어주세요");
        }else if(state==SOLD_OUT){
            System.out.println("이미 동전이 없습니다");
        }
        else if(state==SOLD){
            System.out.println("이미 알맹이를 뽑았습니다");
        }
    }
    public void turnCrank(){//손잡이 돌리는 경우
        if(state==HAS_QUARTER){
            System.out.println("손잡이를 돌렸습니다 알맹이가 나옵니다");
            state=SOLD;
            dispense();
        }
        else if(state==NO_QUARTER){
            //state=HAS_QUARTER;
            System.out.println("동전을 넣어주세요");
        }else if(state==SOLD_OUT){
            System.out.println("매진입니다");
        }
        else if(state==SOLD){
            System.out.println("손잡이는 한번만 돌려주세요");
        }
    }
    public void dispense(){//알맹이 꺼내기
        if(state==HAS_QUARTER){
            System.out.println("알맹이가 나갈 수 없습니다.");

        }
        else if(state==NO_QUARTER){
            //state=HAS_QUARTER;
            System.out.println("동전을 넣어주세요");
        }else if(state==SOLD_OUT){
            System.out.println("매진입니다");
        }
        else if(state==SOLD){
            System.out.println("알맹이가 나가고 있습니다");
            count=count-1;
            if(count==0){
                System.out.println("알맹이가 없습니다");
                state=SOLD_OUT;
            }else{
                state=NO_QUARTER;
            }
        }
    }

    public String toString(){
        String temp="\n주식회사 왕뽑기 \n"+"남은 알맹이 개수: "+count+"\n";
       return temp;
    }
}
