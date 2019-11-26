package Pattern.Decorator.test;

public abstract class Beverage {
    public String description = "Beverage's description";
    public String getDescription(){
        return description;
    }
    public abstract Double cost();
}
