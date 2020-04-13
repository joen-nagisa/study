package Pattern.iterator;

import java.util.List;

public class LunchIterator implements Iterator {
    List<MenuItem> items;
    int position;
    public LunchIterator(List<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if(position>=items.size()||items.get(position)==null) {
            return false;
        }else{
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem item = items.get(position);
        position++;
        return item;
    }
}
