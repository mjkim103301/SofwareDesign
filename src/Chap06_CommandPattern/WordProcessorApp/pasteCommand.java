package Chap06_CommandPattern.WordProcessorApp;

import java.util.Stack;

public class pasteCommand implements AppCommand {
    private static String target="";
    Paste paste;

    pasteCommand(Paste paste){
        this.paste=paste;
    }
    @Override
    public void execute(Stack stack) {
        paste.setStart();
        paste.setInsertString();
        target=paste.start(stack);
        stack.push(target);
    }

    @Override
    public void undo() {

    }



}
