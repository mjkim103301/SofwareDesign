package Chap06_CommandPattern.WordProcessorApp;

import java.util.Scanner;

public class cutCommand implements AppCommand {
    private static String target;
    Cut cut;

    cutCommand(Cut cut){
        this.cut=cut;
    }
    @Override
    public void execute() {
        cut.setStart();
        cut.setCutNum();
        target=cut.start(target);


    }

    @Override
    public void undo() {

    }

    @Override
    public void setString() {//이전 단계에서 수정한거 세팅
      target=pasteCommand.getString();
    }


    public static String getString() {
        return target;
    }
}
