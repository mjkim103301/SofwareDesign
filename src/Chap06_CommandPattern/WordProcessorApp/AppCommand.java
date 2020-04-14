package Chap06_CommandPattern.WordProcessorApp;

import java.util.Stack;

public interface AppCommand {

    public void execute(Stack<String> stack);
    public void undo();

}
