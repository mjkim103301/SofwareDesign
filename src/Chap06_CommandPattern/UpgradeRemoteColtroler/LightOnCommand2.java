package Chap06_CommandPattern.UpgradeRemoteColtroler;


public class LightOnCommand2 implements Command2 {

    Light2 light;

    public LightOnCommand2(Light2 livingRoomLight) {
        this.light=livingRoomLight;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
