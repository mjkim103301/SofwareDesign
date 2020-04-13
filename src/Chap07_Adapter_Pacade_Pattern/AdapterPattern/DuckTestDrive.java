package Chap07_Adapter_Pacade_Pattern.AdapterPattern;

public class DuckTestDrive {
    public static void main(String [] args){
        MallarDuck duck=new MallarDuck();
        WildTurkey turkey=new WildTurkey();
        Duck turkeyAdapter=new TurkeyAdapter(turkey);
        Turkey DuckAdapter=new DuckAdapter(duck);

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\n The DUck says...");
        testDuck(duck);

        System.out.println("\n The TurkeyAdapter says...");
        testDuck(turkeyAdapter);

        System.out.println("\n The DuckAdapter says...");
        testTurkey(DuckAdapter);
    }
    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
    static void testTurkey(Turkey turkey){
        turkey.gobble();
        turkey.fly();
    }
}
