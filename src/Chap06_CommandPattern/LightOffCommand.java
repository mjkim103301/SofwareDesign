package Chap06_CommandPattern;

public class LightOffCommand implements Command2 {
    Light2 light;
    public LightOffCommand(Light2 light){
        this.light=light;
    }
    public void execute(){
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
