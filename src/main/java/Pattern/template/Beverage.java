package Pattern.template;

public abstract class Beverage {
    /**
     * prepareRecipe()就是模板方法。
     */
    final void prepareRecipe(){
        boilWater();
        steepBeverage();
        addCondiments();
        pourInCup();
        hook();
    }

    /**
     * 钩子方法，可以让子类有能力对算法的不同点进行挂钩。要不要挂钩由子类自己决定。
     * 甚至可以让钩子方法来决定模板的流程
     */
    void hook() {

    }

    void boilWater(){
        System.out.println("烧水");
    }
    abstract  void steepBeverage();
    abstract  void addCondiments();

    void pourInCup(){
        System.out.println("倒水进杯子");
    }

}
