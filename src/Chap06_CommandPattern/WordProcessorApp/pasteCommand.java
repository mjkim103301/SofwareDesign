package Chap06_CommandPattern.WordProcessorApp;

public class pasteCommand implements AppCommand {
    private static String target;
    Paste paste;

    pasteCommand(Paste paste){
        this.paste=paste;
    }
    @Override
    public void execute() {
        paste.setStart();
        paste.setInsertString();
        target=paste.start(target);
    }

    @Override
    public void undo() {

    }

    @Override
    public void setString() {
        target=cutCommand.getString();
    }

    public static String getString() {
        return target;
    }


}
