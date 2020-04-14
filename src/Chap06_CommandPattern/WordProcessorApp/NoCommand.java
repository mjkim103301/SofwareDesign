package Chap06_CommandPattern.WordProcessorApp;

import java.util.Stack;

public class NoCommand implements AppCommand {
    @Override
    public void execute(Stack<String> stack) {

    }

    @Override
    public void undo(Stack<String> stack) {

    }

}
