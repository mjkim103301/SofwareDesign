package Chap12_CompoundPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {
    ArrayList quakers=new ArrayList();

    public void add(Quackable quacker){
        quakers.add(quacker);
    }
    @Override
    public void quack() {
        Iterator iterator=quakers.iterator();
        while(iterator.hasNext()){
            Quackable quacker=(Quackable)iterator.next();
            quacker.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        Iterator iterator=quakers.iterator();
        while(iterator.hasNext()){
            Quackable duck=(Quackable)iterator.next();
            duck.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {

    }

}
