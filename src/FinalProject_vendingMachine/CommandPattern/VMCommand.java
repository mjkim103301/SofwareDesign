package FinalProject_vendingMachine.CommandPattern;

public class VMCommand {
    String vending_machine;
    int volume;
    public VMCommand(String VM){
        this.vending_machine=VM;
    }
    void on(){

        System.out.println(vending_machine+ " 가게 불 켜기");
        System.out.println(vending_machine+ " 자판기 가동시키기");
        System.out.println(vending_machine+ " 스피커 on");
    }

    void off() {
        System.out.println(vending_machine+ " 가게 불 끄기");
        System.out.println(vending_machine+ " 자판기 종료하기");
        System.out.println(vending_machine+ " 스피커 off");
    }
    void setVolume(int volume){
        this.volume=volume;
        System.out.println(vending_machine+ "배경음악 크기: "+volume+"으로 조정");
    }
}
