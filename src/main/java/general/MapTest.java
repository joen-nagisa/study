package general;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer, String>(3);
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
        //第一种遍历
        for (Map.Entry<Integer,String> a:map.entrySet()){
            System.out.println("第一种》》》》》》》");
            System.out.println("key: "+a.getKey());
            System.out.println("value: "+a.getValue());
            System.out.println("<<<<<<<<<<<<<<");
        }
        //第二种遍历
        Iterator<Map.Entry<Integer,String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer,String> entry = iterator.next();
            entry.getKey();
            entry.getValue();
        }
    }
}
