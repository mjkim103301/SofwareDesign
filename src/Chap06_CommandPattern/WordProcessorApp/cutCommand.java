package Chap06_CommandPattern.WordProcessorApp;

import java.util.Scanner;
import java.util.Stack;

public class cutCommand implements AppCommand {
    private static String target;
    Cut cut;

    cutCommand(Cut cut){
        this.cut=cut;
    }
    @Override
    public void execute(Stack<String> stack) {
        cut.setStart();
        cut.setCutNum();
        target=cut.start(stack);


    }

    @Override
    public void undo() {

    }

}
