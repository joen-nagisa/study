package lang3;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.SystemUtils;

import java.util.Objects;


public class ArrayUtilsTest {
    public static void main(String[] args) {
        hashCodeDemo();
    }

    /**
     * 判断相同个数，相同顺序的数组是否一样
     */
    public static void hashCodeDemo(){
//        A a1 = new A();
//        A a2 = new A();
//        a2.A1=2;
//        A [] a1Arr = new A []{a1,a2};
//        A [] a2Arr = new A []{a2};
////        System.out.println("a1Arr: "+ArrayUtils.hashCode(a1Arr));//俩hash不同，对对象无效
////        System.out.println("a2Arr: "+ArrayUtils.hashCode(a2Arr));//
//
//        String[] inArr = new String [] {"a","b","c"};
//        String[] inArr2 = new String [] {"a","c","b"};
//        System.out.println("inArr: "+ArrayUtils.hashCode(inArr));//这样的结果是不同的
//        System.out.println("inArr2: "+ArrayUtils.hashCode(inArr2));
//        ArrayUtils.reverse(inArr);  反转数组内容
//        System.out.println(ArrayUtils.isSameType(inArr,inArr2));//true 判断数组类型是否相同
//        String [] clone = ArrayUtils.clone(inArr); //拷贝数组
//        String [] son = ArrayUtils.subarray(inArr,0,2); //截取子数组  a、b
//        System.out.println(ArrayUtils.indexOf(inArr,"b"));   //查询元素，返回下标  1
//        System.out.println(ArrayUtils.indexOf(inArr,"b",1)); //查询元素，返回下边，指定开始下标 1
//        System.out.println(Objects.deepEquals(inArr,inArr2));// true  判断数组是否相同，元素不能是对象
//        A a = new A();
//        System.out.println(ArrayUtils.toString(a1Arr));
//        System.out.println(ArrayUtils.contains(a1Arr,a1));  //判断某个obj是否在数组中。 true  对象的话必须是包含的
//        System.out.println(Objects.deepEquals(new int[] { 1, 3, 2 }, new int[] { 1, 2, 3 }));// false
//        System.out.println(ArrayUtils.toString(inArr));

//        String [] nullArr = null ;
////        System.out.println(nullArr[0]);
//        String [] tem =  ArrayUtils.nullToEmpty(nullArr);
//        System.out.println(tem[0]);

//        System.out.println("UserDir"+SystemUtils.getUserDir());//获取当前项目所在路径
//        System.out.println("USER_COUNTRY "+SystemUtils.USER_COUNTRY); //获取所在地区
//        System.out.println("Linux? "+SystemUtils.IS_OS_WINDOWS); //判断是否window系统
//        System.out.println("语言类型："+SystemUtils.USER_LANGUAGE); //判断语言类型

//        System.out.println(StringUtils.isBlank("\n\t")); //true  判断是否为空或空字符串
//        System.out.println(StringUtils.leftPad("abc", 10, "123"));
//        System.out.println(StringUtils.rightPad("abc", 10, "123"));

//        System.out.println(StringUtils.isNumeric("314.4")); //false
//        System.out.println(StringUtils.isNumeric("-314")); //false
//        System.out.println(StringUtils.isNumeric("0")); //true
//        System.out.println(StringUtils.center("AB",5,"12")); 1AB12
//        String strs3 = "yanshao@man@25@";
//        System.out.println("chop>>>>"+StringUtils.chop(strs3)); //yanshao@man@25
//        System.out.println(StringUtils.containsOnly("abc ","abc")); //false
//        System.out.println(StringUtils.countMatches("abca","a")); //2
//        System.out.println(StringUtils.containsWhitespace(" ab")); //true
//        System.out.println(StringUtils.endsWithAny("abc","ad","a","c"));//false
//        System.out.println(StringUtils.remove("ababc","b"));//aac
//        System.out.println(StringUtils.removeEnd("ababc","bc"));//aac
//        System.out.println(StringUtils.getCommonPrefix("ab","ac","abbb"));//a
//        System.out.println("a"+StringUtils.getCommonPrefix("ab","ac","bbb")+"b");//a
//        System.out.println(StringUtils.substring("abcd",0,2)); //ab
//        System.out.println(StringUtils.substringAfterLast("abbc","b")	);//c
//        System.out.println(StringUtils.indexOfAnyBut("abcc","ab"));
//        System.out.println(StringUtils.indexOfAnyBut("abcc","ae"));
//        System.out.println(StringUtils.indexOfAnyBut("abcc","e"));
//        System.out.println(StringUtils.indexOfAnyBut("abc","abce"));
        System.out.println(StringUtils.indexOfDifference("abbc","accc"));//1
    }
}

class A {
    int A1 = 1;
    String A2 = "A";
}
class B {
    int B1 = 2;
    String B2 = "B";
}