package Pattern.Decorator.test;

public class Demo  {
    public static void main(String[] args) {
        Beverage b = new Tea();
        System.out.println(b.getDescription()+" ~one~ "+b.cost());

        Beverage beverage = new Coffee();
        System.out.println(beverage.getDescription()+" !!!  "+beverage.cost());
        beverage = new Sweet(beverage);
        System.out.println(beverage.getDescription()+" !!!  "+beverage.cost());
        beverage = new Salt(beverage);
        System.out.println(beverage.getDescription()+" !!!  "+beverage.cost());

    }
}
