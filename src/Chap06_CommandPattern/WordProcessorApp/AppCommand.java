package Chap06_CommandPattern.WordProcessorApp;

import java.util.Stack;

public interface AppCommand {

     void execute(Stack<String> stack);
     void undo(Stack<String> stack);

}
