package Pattern.Decorator.test;

public class Sweet extends Condiment {
    private Drink drink;
    Sweet(Drink drink){
        this.drink =drink;
    }
    @Override
    public String getDescription() {
        return drink.getDescription()+" Sweet ";
    }

    @Override
    public int cost() {
        return drink.cost()+5;
    }
}
