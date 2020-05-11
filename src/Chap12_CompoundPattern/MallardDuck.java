package Chap12_CompoundPattern;

public class MallardDuck implements Quackable {
    @Override
    public void quack() {//표준적인 물오리
        System.out.println("꽥꽥");
    }
}
