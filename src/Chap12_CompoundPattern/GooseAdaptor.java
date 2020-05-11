package Chap12_CompoundPattern;

public class GooseAdaptor implements Quackable{
    Goose goose;
    public GooseAdaptor(Goose goose){
        this.goose=goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
