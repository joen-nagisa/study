package Pattern.adapter;

public class TurkeyAdapter implements Duck {
    Turkey turkey;
    TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gogoo();
    }

    @Override
    public void fly() {
        turkey.fly();
        turkey.fly();
    }
}
