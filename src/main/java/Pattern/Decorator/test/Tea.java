package Pattern.Decorator.test;

public class Tea extends Beverage {
    Tea(){
        description = "Tea's Beverage";
    }



    @Override
    public Double cost() {
        return 20.0;
    }
}
