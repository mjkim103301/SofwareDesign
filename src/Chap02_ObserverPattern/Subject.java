package Chap02_ObserverPattern;

public interface Subject {
    public void registgerObserver(Chap02_ObserverPattern.Observer o);
    public void removeObserver(Chap02_ObserverPattern.Observer o);
    public void notifyObservers();


}

