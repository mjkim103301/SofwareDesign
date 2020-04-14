package Chap06_CommandPattern.WordProcessorApp;

public interface AppCommand {

    public void execute();
    public void undo();
    public void setString();
}
