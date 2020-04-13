package java8;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("2","anna","gooogle");
        System.out.println(list);
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        Collections.sort(list,(o1,o2)->o1.compareTo(o2));

//        list.sort();

        System.out.println(list);
    }
}

/**
 * 接口方法用default修饰能直接实现，通过内部类能直接访问使用实现的方法
 */
@FunctionalInterface
interface InterfaceDefault{
    int augment(int a);

    default int defaultDemo(){
        return 4;
    }

}
