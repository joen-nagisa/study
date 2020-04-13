package Pattern.iterator;

public class BreakfastMenu {
    static final int MAX_ITEMS=6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public Iterator createIterator(){
        return new BreakfastIterator(menuItems);
    }
}
