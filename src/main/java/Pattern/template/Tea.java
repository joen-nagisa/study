package Pattern.template;

public class Tea extends Beverage {
    @Override
    void steepBeverage() {
        System.out.println("泡茶");
    }

    @Override
    void addCondiments() {
        System.out.println("加柠檬");
    }
}
