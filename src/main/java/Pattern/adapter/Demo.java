package Pattern.adapter;

public class Demo {
    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();
        Duck duck = new MallardDuck();
        testDuck(duck);
        Duck fake = new TurkeyAdapter(turkey);
        testDuck(fake);
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
