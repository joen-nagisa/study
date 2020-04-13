package Pattern.Decorator.test;

public class Salt extends Condiment {
    Drink drink;
    Salt(Drink drink){
        this.drink = drink;
    }
    @Override
    public String getDescription() {
        return drink.getDescription()+" Salt ";
    }

    @Override
    public int cost() {
        return drink.cost()+3;
    }
}
