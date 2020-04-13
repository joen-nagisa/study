package Pattern.Decorator.test;

public abstract class Drink {
    public String description = "Drink's description";
    public String getDescription(){
        return description;
    }
    public abstract int cost();

}
