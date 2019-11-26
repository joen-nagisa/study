package Pattern.Decorator.test;

public class Salt extends BeverageDecorator {
    private Beverage beverage;
    Salt(Beverage beverage1){
        this.beverage = beverage1;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" Salt ";
    }

    @Override
    public Double cost() {
        return beverage.cost()+0.3;
    }
}
