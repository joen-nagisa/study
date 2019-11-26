package Pattern.Decorator;

public class Demo {
    public static void main(String[] args) {
//        Integer a = 1;
//        System.out.println(a % 1);
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()+"$"+beverage.cost());

        Beverage beverage1=new HouseBlend();
        beverage1 = new Mocha(beverage1);
//        beverage1 = new Mocha(beverage1);
        System.out.println(beverage1.getDescription() + "$"+beverage1.cost());
    }
}
