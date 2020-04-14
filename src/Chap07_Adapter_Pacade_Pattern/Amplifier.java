package Chap07_Adapter_Pacade_Pattern;

public class Amplifier {
    CdPlayer cd;
    void on(){
        System.out.println("amp on");
    }
    void setCD(CdPlayer cd){
        this.cd=cd;
        System.out.println("amp set cd");
    }
    void setVolume(int volume){
        System.out.println("amp set volume to "+volume);
    }
    void off(){
        System.out.println("amp off");
    }
}
