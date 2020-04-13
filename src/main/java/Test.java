import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Test {
    public static void main(String[] args) {
//        go();
//        run();

//        longestPalindrome("zudfweormatjycujjirzjpyrmaxurectxrtqedmmgergwdvjmjtstdhcihacqnothgttgqfywcpgnuvwglvfiuxteopoyizgehkwuvvkqxbnufkcbodlhdmbqyghkojrgokpwdhtdrwmvdegwycecrgjvuexlguayzcammupgeskrvpthrmwqaqsdcgycdupykppiyhwzwcplivjnnvwhqkkxildtyjltklcokcrgqnnwzzeuqioyahqpuskkpbxhvzvqyhlegmoviogzwuiqahiouhnecjwysmtarjjdjqdrkljawzasriouuiqkcwwqsxifbndjmyprdozhwaoibpqrthpcjphgsfbeqrqqoqiqqdicvybzxhklehzzapbvcyleljawowluqgxxwlrymzojshlwkmzwpixgfjljkmwdtjeabgyrpbqyyykmoaqdambpkyyvukalbrzoyoufjqeftniddsfqnilxlplselqatdgjziphvrbokofvuerpsvqmzakbyzxtxvyanvjpfyvyiivqusfrsufjanmfibgrkwtiuoykiavpbqeyfsuteuxxjiyxvlvgmehycdvxdorpepmsinvmyzeqeiikajopqedyopirmhymozernxzaueljjrhcsofwyddkpnvcvzixdjknikyhzmstvbducjcoyoeoaqruuewclzqqqxzpgykrkygxnmlsrjudoaejxkipkgmcoqtxhelvsizgdwdyjwuumazxfstoaxeqqxoqezakdqjwpkrbldpcbbxexquqrznavcrprnydufsidakvrpuzgfisdxreldbqfizngtrilnbqboxwmwienlkmmiuifrvytukcqcpeqdwwucymgvyrektsnfijdcdoawbcwkkjkqwzffnuqituihjaklvthulmcjrhqcyzvekzqlxgddjoir");
//        System.out.println(longestPalindrome("bb"));
        System.out.println(longestPalindromeGood("bananas"));
    }

    public static String test(String str ){
        if(null==str || str.length()==0){
            return "";
        }
        int [] range = new int [2];
        char [] chars = str.toCharArray();
        for(int i=0;i< str.length()-1;i++){
            int right = i;

        }
        return null;
    }

    /**
     * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
     * 性能达标版
     **/
    private static String longestPalindromeGood(String s) {
        if (null == s || s.length() == 0) {
            return "";
        }
        int[] range = new int[2];
        char[] chars = s.toCharArray();
        //一个字一个字的遍历，
        for (int i = 0; i < s.length() - 1; i++) {
            //返回i可以过滤掉中间字是重复相同字的情况
            i = getMiddlePalindrome(i, chars, range);
        }
        String result = s.substring(range[0], range[1] + 1);
        return result;
    }

    /*找到回文*/
    private static int getMiddlePalindrome(int left, char[] chars, int[] range) {
        int right = left;
        //中间字是多个相同char的情况,right 用来控制中间字符的右边边界
        while (right < chars.length - 1 && chars[left] == chars[right + 1]) {
            right++;
        }
        //必须要这样做不然“bananas”这种情况不行, 有这个就会在中间字n之后继续，而不是直接跳过回文
        int result = right;

        /*边界像两边扩散*/
        while (left > 0 && right < chars.length - 1 && chars[left - 1] == chars[right + 1]) {
            left--;
            right++;
        }

        /*记录最长的字符串*/
        if (right - left > range[1] - range[0]) {
            range[0] = left;
            range[1] = right;
        }
        return result;
    }

    /**
     * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
     * 这个性能不达标
     **/
    public static String longestPalindrome(String s) {
        String str = "";
        String result = "";
        String[][] array;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length() + 1; j++) {
                str = s.substring(i, j);
                //判断是否是回文
                if (!isPalindrome(str)) {
                    continue;
                }
                if (result.length() < str.length()) {
                    result = str;
                }
            }
        }
        return result;
    }

    /**
     * 判断传入的string是否是回文
     **/
    private static boolean isPalindrome(String str) {
        char[] array = str.toCharArray();
        for (int k = 0; k < array.length / 2; k++) {
            if (array[k] != array[array.length - k - 1]) {
                return false;
            }
        }
        return true;
    }


    /**
     * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
     */
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    private static void go() {
        int a = 0;
        //System.out.println(++a);//1
        System.out.println(a++); //0
    }

    private static void run() {
        List<Person> result = new ArrayList<>();
        List<Person> newList = new ArrayList<>();
        List<Person> list = new ArrayList<Person>();
        List<String> list2 = new ArrayList<String>();
        list.add(new Person("one", 1, "深圳"));
        list.add(new Person("two", 2, "北京"));
        list2.add("黑夜");
        list2.add("白天");

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                try {
                    newList = deepCopy(list);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                newList.get(i).setAddr(list2.get(j));
                result.add(newList.get(i));
            }
        }


        System.out.println("dfd");
//        String DateOne="HH:mm:ss yyyy aa MMM";//22:51:39 2019 下午 11月
        //SimpleDateFormat  默认的格式： 2019/11/30 下午10:53

//        //日期转特定格式显示
//        Date date = new Date();
//        String str = date.toString();
//        System.out.println("now time: "+str); //Sat Nov 30 22:51:39 CST 2019
//        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss yyyy a MMM");
//        str = sdf.format(date);
//        System.out.println("now time: "+str);
//        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //string转成date
//        String strDate = "10:56:30 2019 PM Nov";
//        SimpleDateFormat sdff = new SimpleDateFormat("hh:mm:ss yyyy a MMM",Locale.ENGLISH);
//        try {
//            Date date1 = sdff.parse(strDate);
//            System.out.println("是否成功 "+date1);
//        } catch (ParseException e) {
//            e.printStackTrace();
//            System.out.println("字符串转date失败");
//        }

    }

    public static <T extends Serializable> List<T> deepCopy(List<T> src) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(byteOut);
        out.writeObject(src);
        out.close();

        ByteArrayInputStream byteIn = new ByteArrayInputStream(byteOut.toByteArray());
        ObjectInputStream in = new ObjectInputStream(byteIn);
        in.close();
        @SuppressWarnings("unchecked")
        List<T> dest = (List<T>) in.readObject();
        return dest;
    }

    public static <T extends Serializable> T clone(T t) {
        T cloneObj = null;

        try {
            // 将对象写入字节流
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(t);
            oos.close();

            // 从字节流中读取
            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            cloneObj = (T) ois.readObject();

            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return cloneObj;
    }

    static class Person implements Serializable {
        private String name;
        private Integer age;
        private String addr;

        Person() {
        }

        Person(String name, Integer age, String addr) {
            this.name = name;
            this.addr = addr;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public String getAddr() {
            return addr;
        }

        public void setAddr(String addr) {
            this.addr = addr;
        }
    }
}
