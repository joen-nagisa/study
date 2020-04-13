package Pattern.iterator;

public class Demo {
    public static void main(String[] args) {
        BreakfastMenu b = new BreakfastMenu();
        LunchMenu l = new LunchMenu();

        Waitress waitress = new Waitress(b,l);

        waitress.printMenu();
    }
}
