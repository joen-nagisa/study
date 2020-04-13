package Pattern.iterator;

public class Waitress {
    BreakfastMenu breakfastMenu;
    LunchMenu lunchMenu;

    public Waitress(BreakfastMenu breakfastMenu, LunchMenu lunchMenu) {
        this.breakfastMenu = breakfastMenu;
        this.lunchMenu = lunchMenu;
    }
    public void printMenu(){
        Iterator breakfastIterator = breakfastMenu.createIterator();
        Iterator lunchIterator = lunchMenu.createIterator();

        System.out.println("Menu\n-----\nBreakFastMenu");
        printMenu(breakfastIterator);
        System.out.println("\nLunch");
        printMenu(lunchIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()){
            MenuItem item = (MenuItem) iterator.next();
            System.out.println(item.getName());
            System.out.println(item.getDescription());
            System.out.println(item.getPrice());
        }
    }
}
