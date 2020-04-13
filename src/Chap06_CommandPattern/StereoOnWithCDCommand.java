package Chap06_CommandPattern;

public class StereoOnWithCDCommand implements Command2{
    Stereo stereo;
    public StereoOnWithCDCommand(Stereo stereo){
        this.stereo=stereo;

    }
    public void execute(){
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
