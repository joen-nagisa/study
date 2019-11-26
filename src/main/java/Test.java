import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        run();
    }

    private static void run() {
//        String str = "good.jpg";
//        int a = str.lastIndexOf(".");
//        System.out.println(a);
//        str.substring(0,a);
//        System.out.println(str);

//        EnumTest enumTest=EnumTest.EMP;
//        enumTest.Go();

        List<Integer > list = new ArrayList<Integer>(5);
        list.add(3);
        list.add(4);

        System.out.println( list.indexOf(6));
//        list.add(5);
//        list.remove(0);
//        System.out.println(list.toString());
    }
}
