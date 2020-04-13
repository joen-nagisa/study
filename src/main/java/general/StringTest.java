package general;

public class StringTest {
    public static void main(String[] args) {
        testRun();
    }

    private static void testRun() {
        //String、Stringbuilder、StringBuffer的区别
        //StringBuilder 和 StringBuffer都不能设为null，而String可以
        //int str.length（）  获取字符串长度
        String str="ni \t\n 小可i";
        System.out.println(str.length());   //9

        //char str.charAt(1)    获取下表出的字符
        System.out.println(str.charAt(1)); //i

        //char[] str.toCharArray()    将字符串变成字符数组
        char[] chars = str.toCharArray();

        //int str.indexOf("i",2); 返回i在字符串中的下标,从第二个开始找  lastIndexOf("i")从屁股开始找
        System.out.println(str.indexOf("i",2));   //8

        //str.toUpperCase(),str.toLowerCase() 字符串大小写装换
        System.out.println("ni 好 \n m".toUpperCase());

        //String[] split("")    根据给定的正则表达式的匹配来拆分此字符串。形成一个新的String数组。
        String [] ar = "a:b:c".split(":");  //a、b、c

        //str.trim()    去掉左右空格

        //str.replace("a","b")  把字符串中所有a全替换成b   可以用来去除空格
        System.out.println("abcccd".replace("c","b"));      //abbbbd

        //String replaceAll(String,String)  把某个内容全部替换成指定内容

        //String replaceFirst(String,String) 把第一次出现的替换成指定内容
        System.out.println("abbc".replaceFirst("b","B")); //aBbc


        //str.substring(int a,int b)   str.substring(int i) 截取字符串
        System.out.println("12345".substring(2)); //345 包含2
        System.out.println("12345".substring(2,3)); //3 不包含2

        //boolean str.equalsIgnoreCase(String)  不在乎大小写是否相同

        //boolean   contains(String)    判断是否包含指定字符
        System.out.println("abc".contains("b")); //true

        //boolean   starsWith(String)   判断是否以指定字符开始
        //boolean endWith(String)

    }
}
