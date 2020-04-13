package Pattern.adapter;

public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("MallardDuck say :'Quack'");
    }

    @Override
    public void fly() {
        System.out.println("MallardDuck fly~~~!");
    }
}
