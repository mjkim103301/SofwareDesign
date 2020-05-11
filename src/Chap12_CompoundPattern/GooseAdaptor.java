package Chap12_CompoundPattern;

public class GooseAdaptor implements Quackable{
    Goose goose;
    Observable observable;
    public GooseAdaptor(Goose goose){
        this.goose=goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
