package Chap06_CommandPattern.UpgradeRemoteColtroler;

public class StereoOffWithCDCommand implements Command2{
    Stereo stereo;
    public StereoOffWithCDCommand(Stereo stereo){
        this.stereo=stereo;

    }
    public void execute(){
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
    }
}
