package Chap06_CommandPattern.WordProcessorApp;

import java.util.Stack;

public class pasteCommand implements AppCommand {

    Paste paste;

    pasteCommand(Paste paste){
        this.paste=paste;
    }
    @Override
    public void execute(Stack stack) {
        paste.setStart();
        paste.setInsertString();
        paste.start(stack);

        System.out.println("stack size: "+stack.size());
    }

    @Override
    public void undo(Stack<String> stack) {
        stack.pop();
        String temp=stack.peek();
        System.out.println(temp);
    }



}
