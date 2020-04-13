package Pattern.Decorator.test;

public class Coffee extends Drink {
    Coffee(){
        this.description = "Coffee's description";
    }

    @Override
    public int cost() {
        return 20;
    }
}
