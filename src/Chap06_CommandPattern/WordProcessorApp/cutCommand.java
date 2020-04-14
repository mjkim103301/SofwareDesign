package Chap06_CommandPattern.WordProcessorApp;

import java.util.Stack;

public class cutCommand implements AppCommand {

    Cut cut;

    cutCommand(Cut cut){
        this.cut=cut;
    }
    @Override
    public void execute(Stack<String> stack) {
        cut.setStart();
        cut.setCutNum();
        cut.start(stack);
        System.out.println("stack size: "+stack.size());

    }

    @Override
    public void undo(Stack<String> stack) {

        stack.pop();
        String temp=stack.peek();
        System.out.println(temp);
    }

}
