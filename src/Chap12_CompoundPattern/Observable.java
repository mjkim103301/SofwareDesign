package Chap12_CompoundPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class Observable  implements QuackObservable{
    ArrayList observers=new ArrayList();
    QuackObservable duck;

    Object object;
    public Observable(QuackObservable duck){
        this.duck=duck;
        object=duck;
    }



    public void registerObserver(Observer observer) {
        observers.add(observer);
    }



    @Override
    public void notifyObservers() {

        Iterator iterator=observers.iterator();
        while(iterator.hasNext()){
            Observer observer=(Observer)iterator.next();
            observer.update(duck);//잘 동작할 지 모르겠다
        }
    }
}
