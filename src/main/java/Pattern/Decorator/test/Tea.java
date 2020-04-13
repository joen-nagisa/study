package Pattern.Decorator.test;

public class Tea extends Drink {
    Tea(){
        description = "Tea's description";
    }
    @Override
    public int cost() {
        return 10;
    }
}
