package Chap06_CommandPattern.UpgradeRemoteColtroler;

public class Stereo {
    String stereo;
    int volume;
    Stereo(String stereo){
        this.stereo=stereo;
    }
    void on(){
        System.out.println(stereo+ " stereo on");
    }

    void off() {
        System.out.println(stereo+ " stereo off");
    }
    void setCD(){
        System.out.println(stereo+" stereo set CD");
    }
    void setVolume(int volume){
        this.volume=volume;
        System.out.println(stereo+" stereo volume set 11");
    }
}
