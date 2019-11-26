package Pattern.Decorator.test;

public class Coffee extends Beverage {
    Coffee(){
        description="Coffee";
    }

    @Override
    public Double cost() {
        return 10.0;
    }
}
