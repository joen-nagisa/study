package Pattern.Decorator;

public abstract class Beverage {
     String description="unkown Beverage";

    public String getDescription(){
        return  description;
    }
    public abstract  double cost();

}
