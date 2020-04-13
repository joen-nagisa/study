package Pattern.iterator;

import java.util.List;

public class LunchMenu {
    List<MenuItem> list ;

    public Iterator createIterator(){
        return new LunchIterator(list);
//        return list.iterator();
    }
}
