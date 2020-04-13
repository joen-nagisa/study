package Pattern.Decorator.test;

public class Dome {
    public static void main(String[] args) {
        Drink tea = new Tea();
        System.out.println(tea.getDescription() + " "+tea.cost());

        tea = new Sweet(tea);
        System.out.println("加糖"+tea.getDescription() + " "+tea.cost());
        tea = new Salt(tea);
        System.out.println("又加盐"+tea.getDescription() + " "+tea.cost());

    }
}
