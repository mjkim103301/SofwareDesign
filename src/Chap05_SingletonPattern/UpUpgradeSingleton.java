package Chap05_SingletonPattern;
//UpgradeSingleton의 속도문제 해결방법 1
public class UpUpgradeSingleton {
    private static UpUpgradeSingleton uniqueInstance=new UpUpgradeSingleton();
    private UpUpgradeSingleton(){
    }
    public static synchronized UpUpgradeSingleton getInstance(){
        return uniqueInstance;
    }
}
