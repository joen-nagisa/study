package Pattern.Decorator.test;

public class Sweet extends BeverageDecorator {
    private Beverage beverage;
    Sweet(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" Sweet ";
    }

    @Override
    public Double cost() {
        return beverage.cost()+0.5;
    }
}
