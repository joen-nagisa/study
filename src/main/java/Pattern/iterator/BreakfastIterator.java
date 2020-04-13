package Pattern.iterator;

public class BreakfastIterator implements Iterator {
    MenuItem[] items;
    int position;
    BreakfastIterator(MenuItem[] items){
        this.items=items;
    }
    @Override
    public boolean hasNext() {
        if(position>=items.length||items[position]==null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem item = items[position];
        position++;
        return item;
    }
}
