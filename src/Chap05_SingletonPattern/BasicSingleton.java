package Chap05_SingletonPattern;
//BasicSingleton.getInstance() 만 하면 객체가 만들어진다.
//하지만, 2개 이상 만들게 되면 비동기화이므로 프로그램에 오류가 발생할 수 있다.
public class BasicSingleton {
    private static BasicSingleton uniqueInstance;
    private BasicSingleton(){
    }
    public static BasicSingleton getInstance(){
        if(uniqueInstance==null){
            uniqueInstance=new BasicSingleton();
        }
        return uniqueInstance;
    }
}
