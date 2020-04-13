package Pattern.template;

public class Coffee extends Beverage {
    @Override
    void steepBeverage() {
        System.out.println("冲咖啡");
    }

    @Override
    void addCondiments() {
        System.out.println("加牛奶和糖");
    }
}
